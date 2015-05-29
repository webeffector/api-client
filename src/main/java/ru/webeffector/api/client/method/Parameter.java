package ru.webeffector.api.client.method;

import ru.webeffector.api.client.model.matrix.MatrixInput;
import ru.webeffector.api.client.model.matrix.ParameterInfo;
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
public interface Parameter {

    @ApiMethod(WebeffectorMethod.MatrixParameterSchedule)
    Map<String, Object> schedule(@RequestBody MatrixInput input, @ContextArgument("parameterName") String parameterName,
                                 @ContextArgument("processor") String... processors);

    @Deprecated
    @ApiMethod(WebeffectorMethod.MatrixParameterView)
    ParameterInfo view(@RequestBody MatrixInput input);

    @ApiMethod(WebeffectorMethod.MatrixParameterUpdate)
    ParameterInfo update(@RequestBody MatrixInput input, @ContextArgument("parameterName") String parameterName, @ContextArgument("processor") String... processors);

    @ApiMethod(WebeffectorMethod.MatrixParameterResult)
    ParameterInfo result(@ContextArgument("correlationId") String correlationId);

    @ApiMethod(WebeffectorMethod.MatrixParameterProcessors)
    List<String> processors();

    @ApiMethod(WebeffectorMethod.MatrixParameters)
    List<String> parameters();

    @ApiMethod(WebeffectorMethod.MatrixParameterOptions)
    List<String> options(@ContextArgument("parameterName") String parameterName);
}
