package ru.webeffector.api.client.method;

import ru.webeffector.api.client.model.amplification.activity.PublicationSocialActivityResult;
import ru.webeffector.api.client.util.ApiMethod;
import ru.webeffector.api.client.util.ContextArgument;
import ru.webeffector.api.client.util.RequestBody;
import ru.webeffector.api.client.util.WebeffectorMethod;

import java.util.List;

/**
 * @author Ernest Sadykov
 * @since 26.05.2015
 */
public interface SocialPublicationAmplification {

    @ApiMethod(WebeffectorMethod.AmplificationPublicationActivityFind)
    PublicationSocialActivityResult find(@ContextArgument("id") String projectId,
                                         @RequestBody List<String> urls);

}
