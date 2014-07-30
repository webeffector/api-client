package ru.webeffector.api.client.util;

/**
 * @author Ernest Sadykov
 * @since 18.07.2014
 */
public interface ApiRequest {

    String getUrl();

    ApiRequestParams getParams();

}
