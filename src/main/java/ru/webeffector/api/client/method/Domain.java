package ru.webeffector.api.client.method;

import ru.webeffector.api.client.model.matrix.DomainInfo;
import ru.webeffector.api.client.model.matrix.MatrixInput;
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
public interface Domain {

    @ApiMethod(WebeffectorMethod.MatrixDomainSchedule)
    Map<String, Object> schedule(@RequestBody MatrixInput input, @ContextArgument("processor") String... processors);

    @ApiMethod(WebeffectorMethod.MatrixDomainView)
    DomainInfo view(@RequestBody MatrixInput input);

    @ApiMethod(WebeffectorMethod.MatrixDomainUpdate)
    DomainInfo update(@RequestBody MatrixInput input, @ContextArgument("processor") String... processors);

    @ApiMethod(WebeffectorMethod.MatrixDomainResult)
    DomainInfo result(@ContextArgument("correlationId") String correlationId);

    @ApiMethod(WebeffectorMethod.MatrixDomainProcessors)
    List<String> processors();

    @ApiMethod(WebeffectorMethod.MatrixDomainOptions)
    List<String> options();
}
