package ru.webeffector.api.client.util;

/**
 * @author Ernest Sadykov
 * @since 25.08.2014
 */
public class IdGenerator {

    public static String generateId() {
        return generateId("");
    }

    public static String generateId(String prefix) {
        return prefix + System.currentTimeMillis();
    }

}
