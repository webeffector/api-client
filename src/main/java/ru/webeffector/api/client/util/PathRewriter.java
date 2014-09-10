package ru.webeffector.api.client.util;

/**
 * @author Alexandr Kolosov
 * @since 10.09.2014
 */
public interface PathRewriter {

    String rewrite(String path, Object[] args);

}
