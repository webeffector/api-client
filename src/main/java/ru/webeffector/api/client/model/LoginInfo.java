package ru.webeffector.api.client.model;

/**
 * @author Ernest Sadykov
 * @since 18.07.2014
 */
public class LoginInfo {
    private final String login;

    private final String password;

    public LoginInfo(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
