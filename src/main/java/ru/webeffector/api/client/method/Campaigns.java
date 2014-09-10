package ru.webeffector.api.client.method;

import ru.webeffector.api.client.model.campaign.Campaign;
import ru.webeffector.api.client.model.campaign.CampaignLite;
import ru.webeffector.api.client.util.ApiMethod;
import ru.webeffector.api.client.util.ContextArgument;
import ru.webeffector.api.client.util.RequestBody;
import ru.webeffector.api.client.util.WebeffectorMethod;

import java.util.List;

/**
 * @author Ernest Sadykov
 * @since 30.07.2014
 */
public interface Campaigns {

    @ApiMethod(WebeffectorMethod.CreateCampaign)
    Campaign create(@RequestBody Campaign campaign);

    @ApiMethod(WebeffectorMethod.DeleteCampaign)
    void delete(@ContextArgument("id") String id);

    @ApiMethod(WebeffectorMethod.GetCampaign)
    Campaign get(@ContextArgument("id") String id);

    @ApiMethod(WebeffectorMethod.ListCampaigns)
    List<CampaignLite> list();
}
