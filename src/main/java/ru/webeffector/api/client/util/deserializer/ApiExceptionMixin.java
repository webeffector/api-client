package ru.webeffector.api.client.util.deserializer;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Alexandr Kolosov
 * @since 25.09.2014
 */
public class ApiExceptionMixin {

    private String code;
    private String message;

    @JsonCreator
    public ApiExceptionMixin(@JsonProperty("code") String code, @JsonProperty("message") String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
