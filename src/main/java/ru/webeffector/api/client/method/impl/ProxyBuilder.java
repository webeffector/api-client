package ru.webeffector.api.client.method.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.google.common.reflect.Reflection;
import ru.webeffector.api.client.impl.MethodCaller;
import ru.webeffector.api.client.util.ApiMethod;
import ru.webeffector.api.client.util.ContextArgument;
import ru.webeffector.api.client.util.Json;
import ru.webeffector.api.client.util.WebeffectorMethod;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Ernest Sadykov
 * @since 30.07.2014
 */
public class ProxyBuilder {

    private static class Handler implements InvocationHandler {

        private String name;
        private MethodCaller caller;

        private Handler(String name, MethodCaller caller) {
            this.name = name;
            this.caller = caller;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            assert args == null || args.length == 1;
            if (method.getName().equals("toString") && args == null) {
                return name;
            }

            ApiMethod apiMethod = method.getAnnotation(ApiMethod.class);
            if (apiMethod == null) {
                throw new IllegalStateException("no annotation on method " + method.getName());
            }

            WebeffectorMethod webeffectorMethod = apiMethod.value();

            Object param = args == null ? null : args[0];
            String url = webeffectorMethod.getPath();
            if (param != null) {
                Annotation[][] annotations = method.getParameterAnnotations();
                for (Annotation[] annotationArray : annotations) {
                    for (Annotation annotation : annotationArray) {
                        if (annotation instanceof ContextArgument) {
                            String name = ContextArgument.class.cast(annotation).value();
                            url = url.replace("{" + name + "}", String.valueOf(param));
                            param = null;
                        }
                    }
                }
            }

            JavaType javaType;
            if (webeffectorMethod.getReturnType() != null) {
                javaType = Json.constructType(webeffectorMethod.getReturnType());
            } else {
                Class<?> returnType = method.getReturnType();
                returnType = Void.TYPE.equals(returnType) ? null : returnType;
                javaType = Json.constructType(returnType);
            }

            return caller.call(url, webeffectorMethod.getMethodType(), javaType, param);
        }
    }

    public static <T> T create(Class<T> targetInterface, MethodCaller caller) {
        String name = targetInterface.getName();
        return Reflection.newProxy(targetInterface, new Handler(name, caller));
    }
}