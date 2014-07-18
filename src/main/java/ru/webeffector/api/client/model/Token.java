package ru.webeffector.api.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Ernest Sadykov
 * @since 18.07.2014
 */
public class Token {
    @JsonProperty("token")
    private String token;

    @JsonProperty("access")
    private String access;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
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
