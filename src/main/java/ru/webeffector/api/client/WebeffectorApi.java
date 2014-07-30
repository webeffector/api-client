package ru.webeffector.api.client;

import ru.webeffector.api.client.method.Auth;
import ru.webeffector.api.client.method.Campaigns;

/**
 * @author Ernest Sadykov
 * @since 30.07.2014
 */
public interface WebeffectorApi {

    void updateToken(String token);

    Auth auth();

    Campaigns campaign();

}
