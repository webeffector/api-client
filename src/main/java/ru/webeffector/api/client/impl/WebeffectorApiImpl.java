package ru.webeffector.api.client.impl;

import ru.webeffector.api.client.WebeffectorApi;
import ru.webeffector.api.client.method.Auth;
import ru.webeffector.api.client.method.Budgets;
import ru.webeffector.api.client.method.Campaigns;
import ru.webeffector.api.client.method.Promotions;
import ru.webeffector.api.client.method.impl.ProxyBuilder;
import ru.webeffector.api.client.model.Token;

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
    public void updateToken(Token token) {
        caller.setToken(token.getToken());
    }

    @Override
    public Auth auth() {
        return create(Auth.class);
    }

    @Override
    public Campaigns campaign() {
        return create(Campaigns.class);
    }

    @Override
    public Promotions promotion() {
        return create(Promotions.class);
    }

    @Override
    public Budgets budget() {
        return create(Budgets.class);
    }


    private <T> T create(Class<T> targetInterface) {
        return ProxyBuilder.create(targetInterface, caller);
    }
}
