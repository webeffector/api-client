package ru.webeffector.api.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Ernest Sadykov
 * @since 18.07.2014
 */
public class Token {

    private final String token;
    private final String access;

    public Token(@JsonProperty("token") String token,
                 @JsonProperty("access") String access) {
        this.token = token;
        this.access = access;
    }

    public String getToken() {
        return token;
    }

    public boolean canRead() {
        return access != null && access.contains("r");
    }

    public boolean canWrite() {
        return access != null && access.contains("w");
    }

    public boolean canDelete() {
        return access != null && access.contains("d");
    }
}
