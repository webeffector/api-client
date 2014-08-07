package ru.webeffector.api.client.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.google.common.base.Function;
import com.google.common.util.concurrent.Futures;
import com.ning.http.client.*;
import org.apache.commons.lang3.StringUtils;
import ru.webeffector.api.client.util.Json;
import ru.webeffector.api.client.util.MethodType;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author Ernest Sadykov
 * @since 30.07.2014
 */
public class MethodCaller {
    private static final AsyncHttpClient DEFAULT_CLIENT;
    private static final String BASE_URL;

    static {
        DEFAULT_CLIENT = new AsyncHttpClient(
                new AsyncHttpClientConfig.Builder().setFollowRedirects(true).build());

        String url = System.getProperty("ru.effector.api.url");
        if (StringUtils.isNotBlank(url)) {
            BASE_URL = url;
        } else {
            BASE_URL = "http://api.webeffector.ru";
        }
    }

    private final AsyncHttpClient client;
    private String token;

    public MethodCaller(String token, AsyncHttpClient client) {
        this.token = token;
        this.client = client;
    }

    public MethodCaller(AsyncHttpClient client) {
        this.client = client;
    }

    public <T> T call(String url, MethodType method, JavaType returnType, Object param) {
        Request request = buildRequest(method, url, param);
        Future<T> future = asFuture(request, returnType);
        try {
            return future.get();
        } catch (ExecutionException | InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    private Request buildRequest(MethodType method, String url, Object param) {
        RequestBuilder builder = new RequestBuilder(method.toString()).setUrl(BASE_URL + url);

        if (token != null) {
            builder.addQueryParameter("token", token);
        }

        if (method.hasBody()) {
            builder.setHeader("Content-Type", "application/json; charset=utf-8")
                    .setBodyEncoding("UTF-8");
            builder.setBody(Json.toJson(param).toString());
        }

        return builder.build();
    }

    private <T> Future<T> asFuture(Request request, final JavaType returnType) {
        try {
            com.ning.http.client.ListenableFuture<Response> future = client.executeRequest(request);
            return Futures.lazyTransform(future, new Function<Response, T>() {
                @Override
                public T apply(Response response) {
                    if (returnType != null) {
                        try {
                            return Json.parse(response.getResponseBody(), returnType);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        return null;
                    }
                }
            });
        } catch (IOException e) {
            return Futures.immediateFailedFuture(new IllegalStateException("illegal request"));
        }
    }

    public static MethodCaller defaultCaller(String token) {
        return new MethodCaller(token, DEFAULT_CLIENT);
    }

    public static MethodCaller defaultCaller() {
        return new MethodCaller(DEFAULT_CLIENT);
    }

    public void setToken(String token) {
        this.token = token;
    }
}