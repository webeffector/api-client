package ru.webeffector.api.client.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import ru.webeffector.api.client.impl.ApiException;
import ru.webeffector.api.client.impl.ParseException;
import ru.webeffector.api.client.util.deserializer.ApiExceptionMixin;

import java.io.IOException;

/**
 * @author Ernest Sadykov
 * @since 30.07.2014
 */
public class Json {

    private static final ObjectMapper MAPPER;

    static {
        MAPPER = new ObjectMapper();
        MAPPER.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        MAPPER.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        MAPPER.addMixInAnnotations(ApiException.class, ApiExceptionMixin.class);
        MAPPER.registerModule(new JodaModule().addKeyDeserializer(LocalDate.class, new KeyDeserializer() {
            @Override
            public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException {
                return key.length() == 0 ? null : new LocalDate(key, DateTimeZone.forID("Europe/Moscow"));
            }
        }));
    }

    public static JsonNode toJson(Object obj) {
        return MAPPER.valueToTree(obj);
    }

    public static <T> T parse(String json, JavaType type) {
        try {
            return MAPPER.readValue(json, type);
        } catch (IOException e) {
            throw new ParseException(e);
        }
    }

    public static <T> JavaType constructType(Class<T> clazz) {
        return MAPPER.getTypeFactory().constructType(clazz);
    }

    public static <T> JavaType constructType(TypeReference<T> typeReference) {
        return MAPPER.getTypeFactory().constructType(typeReference);
    }
}

