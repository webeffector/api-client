package ru.webeffector.api.client.impl;

import ru.webeffector.api.client.WebeffectorApi;

/**
 * @author Ernest Sadykov
 * @since 30.07.2014
 */
public class WebeffectorApiFactory {

    public static WebeffectorApi create() {
        return new WebeffectorApiImpl(MethodCaller.defaultCaller());
    }

    public static WebeffectorApi create(String token) {
        return new WebeffectorApiImpl(MethodCaller.defaultCaller(token));
    }

    public static WebeffectorApi create(MethodCaller caller) {
        return new WebeffectorApiImpl(caller);
    }

}
