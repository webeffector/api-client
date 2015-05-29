package ru.webeffector.api.client.util;

/**
 * @author Ernest Sadykov
 * @since 18.07.2014
 */
public enum MethodType {
    GET     (false),
    POST    (true),
    DELETE  (false),
    PUT     (true),
    OPTIONS (false);

    private final boolean hasBody;

    MethodType(boolean hasBody) {
        this.hasBody = hasBody;
    }

    public boolean hasBody() {
        return hasBody;
    }
}
