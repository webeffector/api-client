package ru.webeffector.api.client.method;

import ru.webeffector.api.client.util.ApiMethod;
import ru.webeffector.api.client.util.ContextArgument;
import ru.webeffector.api.client.util.MethodType;

/**
 * @author Ernest Sadykov
 * @since 30.07.2014
 */
public interface Campaign {

    @ApiMethod(value = "/seo/{id}", method = MethodType.DELETE)
    boolean delete(@ContextArgument("id") String id);

}
