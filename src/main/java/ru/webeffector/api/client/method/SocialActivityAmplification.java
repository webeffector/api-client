package ru.webeffector.api.client.method;

import ru.webeffector.api.client.model.amplification.activity.SocialActivityResult;
import ru.webeffector.api.client.util.ApiMethod;
import ru.webeffector.api.client.util.ContextArgument;
import ru.webeffector.api.client.util.RequestBody;
import ru.webeffector.api.client.util.WebeffectorMethod;

import java.util.List;

/**
 * @author Alexandr Kolosov
 * @since 01.12.2014
 */
public interface SocialActivityAmplification {

    @ApiMethod(WebeffectorMethod.AmplificationSocialActivityFind)
    SocialActivityResult find(@ContextArgument("id") String projectId,
                        @RequestBody List<String> urls);

}
