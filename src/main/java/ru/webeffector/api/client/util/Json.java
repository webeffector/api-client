package ru.webeffector.api.client.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

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

    public static <T> T parse(String json, TypeReference<T> tr) {
        try {
            return MAPPER.readValue(json, tr);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T parse(String json, Class<T> resultClass) {
        try {
            return mapper().readValue(json, resultClass);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

