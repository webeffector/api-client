package ru.webeffector.api.client.util;

import com.fasterxml.jackson.core.type.TypeReference;
import ru.webeffector.api.client.model.CampaignLite;

import java.util.List;

/**
 * @author Ernest Sadykov
 * @since 07.08.2014
 */
public enum WebeffectorMethod {
    Token           ("/token", MethodType.POST),
    ListCampaigns   (new TypeReference<List<CampaignLite>>() {}, "/seo"),
    DeleteCampaign  ("/seo/{id}", MethodType.DELETE),
    ListPromotions  (""),
    GetCampaign     ("/seo/{id}")
    ;

    private TypeReference<?> returnType;
    private String path;
    private MethodType methodType;

    WebeffectorMethod(String path) {
        this(path, MethodType.GET);
    }

    WebeffectorMethod(String path, MethodType methodType) {
        this(null, path, methodType);
    }

    WebeffectorMethod(TypeReference<?> returnType, String path) {
        this(returnType, path, MethodType.GET);
    }

    WebeffectorMethod(TypeReference<?> returnType, String path, MethodType methodType) {
        this.returnType = returnType;
        this.path = path;
        this.methodType = methodType;
    }

    public TypeReference<?> getReturnType() {
        return returnType;
    }

    public String getPath() {
        return path;
    }

    public MethodType getMethodType() {
        return methodType;
    }
}
