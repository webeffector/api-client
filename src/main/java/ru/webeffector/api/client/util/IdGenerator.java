package ru.webeffector.api.client.util;

import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

/**
 * @author Ernest Sadykov
 * @since 25.08.2014
 */
public class IdGenerator {

    public static String generateId() {
        return generateId("");
    }

    public static String generateId(String prefix) {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        if (StringUtils.isNotBlank(prefix)) {
            return prefix + uuid.substring(1, uuid.length());
        }

        return uuid;
    }

}
