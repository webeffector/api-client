package ru.webeffector.api.client.model;

import ru.webeffector.api.client.impl.ApiException;

/**
 * @author Alexandr Kolosov
 * @since 10.12.2014
 */
public class ErrorDefinition {

    private String message;
    private String code;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ApiException asException() {
        return new ApiException(code, message);
    }
}
