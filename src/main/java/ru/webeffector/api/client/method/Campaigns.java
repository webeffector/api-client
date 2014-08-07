package ru.webeffector.api.client.method;

import ru.webeffector.api.client.model.Campaign;
import ru.webeffector.api.client.util.ApiMethod;
import ru.webeffector.api.client.util.ContextArgument;
import ru.webeffector.api.client.util.WebeffectorMethod;

import java.util.List;

/**
 * @author Ernest Sadykov
 * @since 30.07.2014
 */
public interface Campaigns {

    @ApiMethod(WebeffectorMethod.DeleteCampaign)
    boolean delete(@ContextArgument("id") String id);

    @ApiMethod(WebeffectorMethod.ListCampaigns)
    List<Campaign> list();
}
