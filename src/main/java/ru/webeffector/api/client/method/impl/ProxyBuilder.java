package ru.webeffector.api.client.method.impl;

import com.google.common.reflect.Reflection;
import ru.webeffector.api.client.impl.MethodCaller;
import ru.webeffector.api.client.util.ApiMethod;
import ru.webeffector.api.client.util.ContextArgument;

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

            ApiMethod annotation = method.getAnnotation(ApiMethod.class);
            if (annotation == null) {
                throw new IllegalStateException("no annotation on method " + method.getName());
            }

            Object param = args == null ? null : args[0];
            String url = annotation.value();
            if (param != null) {
                Annotation[] annotations = method.getParameterAnnotations()[0];
                if (annotations.length > 0) {
                    String name = ((ContextArgument) annotations[0]).value();
                    url = url.replace("{" + name + "}", String.valueOf(param));
                    param = null;
                }
            }

            Class<?> returnType = method.getReturnType();
            returnType = Void.TYPE.equals(returnType) ? null : returnType;

            return caller.call(url, annotation.method(), returnType, param);
        }
    }

    public static <T> T create(Class<T> targetInterface, MethodCaller caller) {
        String name = targetInterface.getName();
        return Reflection.newProxy(targetInterface, new Handler(name, caller));
    }
}