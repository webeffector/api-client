package ru.webeffector.api.client.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;

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
        MAPPER.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
        MAPPER.registerModule(new JodaModule().addKeyDeserializer(LocalDate.class, new KeyDeserializer() {
            @Override
            public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException, JsonProcessingException {
                return key.length() == 0 ? null : new LocalDate(key, DateTimeZone.forID("Europe/Moscow"));
            }
        }));
    }

    public static ObjectMapper mapper() {
        return MAPPER;
    }

    public static JsonNode toJson(Object obj) {
        return MAPPER.valueToTree(obj);
    }

    public static <T> T fromJson(JsonNode json, Class<T> resultClass) {
        try {
            return MAPPER.treeToValue(json, resultClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T parse(String json, TypeReference<T> type) {
        try {
            return MAPPER.readValue(json, type);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T parse(String json, JavaType type) {
        try {
            return MAPPER.readValue(json, type);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T parse(String json, Class<T> clazz) {
        try {
            return mapper().readValue(json, clazz);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> JavaType constructType(Class<T> clazz) {
        return MAPPER.getTypeFactory().constructType(clazz);
    }

    public static <T> JavaType constructType(TypeReference<T> typeReference) {
        return MAPPER.getTypeFactory().constructType(typeReference);
    }
}

