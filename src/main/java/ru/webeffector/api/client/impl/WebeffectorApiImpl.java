package ru.webeffector.api.client.impl;

import ru.webeffector.api.client.WebeffectorApi;
import ru.webeffector.api.client.method.Auth;
import ru.webeffector.api.client.method.Campaign;
import ru.webeffector.api.client.method.impl.ProxyBuilder;

/**
 * @author Ernest Sadykov
 * @since 30.07.2014
 */
class WebeffectorApiImpl implements WebeffectorApi {

    private final MethodCaller caller;

    public WebeffectorApiImpl(MethodCaller caller) {
        this.caller = caller;
    }

    @Override
    public void updateToken(String token) {
        caller.setToken(token);
    }

    @Override
    public Auth auth() {
        return create(Auth.class);
    }

    @Override
    public Campaign campaign() {
        return create(Campaign.class);
    }

    private <T> T create(Class<T> targetInterface) {
        return ProxyBuilder.create(targetInterface, caller);
    }
}