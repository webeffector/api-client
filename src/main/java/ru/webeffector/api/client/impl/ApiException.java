package ru.webeffector.api.client.impl;

/**
 * @author Alexandr Kolosov
 * @since 25.09.2014
 */
public class ApiException extends RuntimeException {

    private String code;
    private Object body;

    public ApiException(Object body) {
        this.body = body;
    }

    public ApiException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public Object getBody() {
        return body;
    }
}
