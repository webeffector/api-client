package ru.webeffector.api.client.method;

import ru.webeffector.api.client.model.amplification.link.LinkFindResult;
import ru.webeffector.api.client.util.ApiMethod;
import ru.webeffector.api.client.util.ContextArgument;
import ru.webeffector.api.client.util.RequestBody;
import ru.webeffector.api.client.util.WebeffectorMethod;

import java.util.List;

/**
 * @author Alexandr Kolosov
 * @since 04.09.2014
 */
public interface LinkAmplification {

    @ApiMethod(WebeffectorMethod.AmplificationLinkFind)
    LinkFindResult find(@ContextArgument("id")String projectId, @RequestBody List<String> urls);

}
