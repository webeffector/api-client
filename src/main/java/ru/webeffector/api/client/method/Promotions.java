package ru.webeffector.api.client.method;

import ru.webeffector.api.client.model.promo.Promotion;
import ru.webeffector.api.client.util.ApiMethod;
import ru.webeffector.api.client.util.ContextArgument;
import ru.webeffector.api.client.util.WebeffectorMethod;

/**
 * @author Ernest Sadykov
 * @since 07.08.2014
 */
public interface Promotions {

    @ApiMethod(WebeffectorMethod.GetPromotion)
    Promotion get(@ContextArgument("campaign_id") String campaignId,
                  @ContextArgument("promo_id") String promoId);

}
