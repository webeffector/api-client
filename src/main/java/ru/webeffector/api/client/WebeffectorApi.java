package ru.webeffector.api.client;

import ru.webeffector.api.client.method.*;
import ru.webeffector.api.client.model.Token;

/**
 * @author Ernest Sadykov
 * @since 30.07.2014
 */
public interface WebeffectorApi {

    void updateToken(Token token);

    Auth auth();

    Campaigns campaign();

    Promotions promotion();

    Budgets budget();

    Amplification amplification();

}
