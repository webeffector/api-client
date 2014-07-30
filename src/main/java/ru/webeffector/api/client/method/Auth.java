package ru.webeffector.api.client.method;

import ru.webeffector.api.client.model.LoginInfo;
import ru.webeffector.api.client.model.Token;
import ru.webeffector.api.client.util.ApiMethod;
import ru.webeffector.api.client.util.MethodType;

/**
 * @author Ernest Sadykov
 * @since 18.07.2014
 */
public interface Auth {

    @ApiMethod(value = "/token", method = MethodType.POST)
    Token token(LoginInfo loginInfo);

}
