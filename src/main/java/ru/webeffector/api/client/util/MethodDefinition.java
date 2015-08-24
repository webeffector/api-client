package ru.webeffector.api.client.util;

import com.fasterxml.jackson.core.type.TypeReference;

/**
 * @author Sergey Zudin
 * @since 24.08.15.
 */
public interface MethodDefinition {

    TypeReference<?> getReturnType();

    String getPath();

    MethodType getMethodType();

    PathRewriter getRewriter();

    Class<?> exceptionClass();

}
