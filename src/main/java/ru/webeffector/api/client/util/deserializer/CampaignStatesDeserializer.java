package ru.webeffector.api.client.util.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.apache.commons.lang3.StringUtils;
import ru.webeffector.api.client.model.campaign.CampaignState;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ernest Sadykov
 * @since 08.08.2014
 */
public class CampaignStatesDeserializer extends StdDeserializer<List<CampaignState>> {
    private CampaignStatesDeserializer() {
        super(TypeFactory.defaultInstance().constructParametricType(List.class, CampaignState.class));
    }

    @Override
    public List<CampaignState> deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        String states = _parseString(jp, ctxt);
        if (StringUtils.isBlank(states)) {
            return Collections.emptyList();
        }
        List<CampaignState> result = new ArrayList<>();
        for (String state : states.split(",")) {
            result.add(CampaignState.valueOf(state.trim()));
        }

        return result;
    }
}