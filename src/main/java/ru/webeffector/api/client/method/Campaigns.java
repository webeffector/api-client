package ru.webeffector.api.client.method;

import ru.webeffector.api.client.model.Campaign;
import ru.webeffector.api.client.util.ApiMethod;
import ru.webeffector.api.client.util.ContextArgument;
import ru.webeffector.api.client.util.MethodType;

import java.util.List;

/**
 * @author Ernest Sadykov
 * @since 30.07.2014
 */
public interface Campaigns {

    @ApiMethod(value = "/seo/{id}", method = MethodType.DELETE)
    boolean delete(@ContextArgument("id") String id);

    @ApiMethod(value = "/seo")
    List<Campaign> list();
}
