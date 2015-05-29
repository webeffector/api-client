package ru.webeffector.api.client.method;

import ru.webeffector.api.client.model.matrix.MatrixInput;
import ru.webeffector.api.client.model.matrix.UrlInfo;
import ru.webeffector.api.client.util.ApiMethod;
import ru.webeffector.api.client.util.ContextArgument;
import ru.webeffector.api.client.util.RequestBody;
import ru.webeffector.api.client.util.WebeffectorMethod;

import java.util.List;
import java.util.Map;

/**
 * @author Sergey Zudin
 * @since 06.03.15.
 */
public interface Url {

    @ApiMethod(WebeffectorMethod.MatrixUrlSchedule)
    Map<String, Object> schedule(@RequestBody MatrixInput input, @ContextArgument("processor") String... processors);

    @ApiMethod(WebeffectorMethod.MatrixUrlView)
    UrlInfo view(@RequestBody MatrixInput input);

    @ApiMethod(WebeffectorMethod.MatrixUrlUpdate)
    UrlInfo update(@RequestBody MatrixInput input, @ContextArgument("processor") String... processors);

    @ApiMethod(WebeffectorMethod.MatrixUrlResult)
    UrlInfo result(@ContextArgument("correlationId") String correlationId);

    @ApiMethod(WebeffectorMethod.MatrixUrlProcessors)
    List<String> processors();

    @ApiMethod(WebeffectorMethod.MatrixUrlOptions)
    List<String> options();
}
