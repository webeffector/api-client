package ru.webeffector.api.client.method;

import ru.webeffector.api.client.model.matrix.MatrixInput;
import ru.webeffector.api.client.model.matrix.PromoInfo;
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
public interface Promo {

    @ApiMethod(WebeffectorMethod.MatrixPromoSchedule)
    Map<String, Object> schedule(@RequestBody MatrixInput input, @ContextArgument("processor") String... processors);

    @ApiMethod(WebeffectorMethod.MatrixPromoView)
    PromoInfo view(@RequestBody MatrixInput input);

    @ApiMethod(WebeffectorMethod.MatrixPromoUpdate)
    PromoInfo update(@RequestBody MatrixInput input, @ContextArgument("processor") String... processors);

    @ApiMethod(WebeffectorMethod.MatrixPromoResult)
    PromoInfo result(@ContextArgument("correlationId") String correlationId);

    @ApiMethod(WebeffectorMethod.MatrixPromoProcessors)
    List<String> processors();

    @ApiMethod(WebeffectorMethod.MatrixPromoOptions)
    List<String> options();
}