package ru.webeffector.api.client.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.google.common.base.Function;
import com.google.common.util.concurrent.Futures;
import com.ning.http.client.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger logger = LoggerFactory.getLogger(MethodCaller.class);
    private static final AsyncHttpClient DEFAULT_CLIENT = new AsyncHttpClient(
            new AsyncHttpClientConfig.Builder().setFollowRedirects(true).build());

    private static final String BASE_URL = System.getProperty("ru.effector.api.url", "http://api.webeffector.ru");

    private final AsyncHttpClient client;
    private String token;

    public MethodCaller(String token, AsyncHttpClient client) {
        this.token = token;
        this.client = client;
    }

    public MethodCaller(AsyncHttpClient client) {
        this.client = client;
    }

    public <T> T call(String url, MethodType method, JavaType returnType, JavaType exceptionType, Object param) {
        Request request = buildRequest(method, url, param);
        Future<T> future = asFuture(request, returnType, exceptionType);
        try {
            return future.get();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof ApiException) {
                throw ((ApiException) cause);
            }

            throw new IllegalStateException(e);
        } catch (InterruptedException e) {
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

    private <T> Future<T> asFuture(Request request, final JavaType returnType, final JavaType exceptionType) {
        try {
            logger.debug("request url: {}", request.getRawUrl());
            logger.debug("request content: {}", request.getStringData());

            com.ning.http.client.ListenableFuture<Response> future = client.executeRequest(request);
            return Futures.lazyTransform(future, new Function<Response, T>() {
                @Override
                public T apply(Response response) {
                    if (returnType != null) {
                        try {
                            String responseBody = response.getResponseBody();
                            int statusCode = response.getStatusCode();

                            logger.debug("response status: {}", statusCode);
                            logger.debug("response body: {}", responseBody);

                            if (statusCode < 400) {
                                return Json.parse(responseBody, returnType);
                            } else {
                                try {
                                    Object result = Json.parse(responseBody, exceptionType);
                                    throw new ApiException(result);
                                } catch (ParseException ignored) {
                                    throw (ApiException) Json.parse(responseBody, SimpleType.construct(ApiException.class));
                                }
                            }
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