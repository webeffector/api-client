package ru.webeffector.api.client.util.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import ru.webeffector.api.client.model.promo.BudgetType;

import java.io.IOException;

/**
 * @author Ernest Sadykov
 * @since 08.08.2014
 */
public class BudgetTypeDeserializer extends StdDeserializer<BudgetType> {
    private BudgetTypeDeserializer() {
        super(BudgetType.class);
    }

    @Override
    public BudgetType deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        String shortTitle = _parseString(jp, ctxt);

        return BudgetType.fromShortTitle(shortTitle);
    }
}