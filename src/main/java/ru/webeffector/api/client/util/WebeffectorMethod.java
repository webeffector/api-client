package ru.webeffector.api.client.util;

import com.fasterxml.jackson.core.type.TypeReference;
import ru.webeffector.api.client.model.amplification.link.LinkFindResult;
import ru.webeffector.api.client.model.budget.BudgetTaskResult;
import ru.webeffector.api.client.model.campaign.CampaignLite;

import java.util.List;

/**
 * @author Ernest Sadykov
 * @since 07.08.2014
 */
public enum WebeffectorMethod {
    Token           ("/token", MethodType.POST),

    ListCampaigns   (new TypeReference<List<CampaignLite>>() {}, "/seo"),
    GetCampaign     ("/seo/{id}"),
    DeleteCampaign  ("/seo/{id}", MethodType.DELETE),

    GetPromotion    ("/seo/{campaign_id}/{promo_id}"),

    AddBudgetTask   ("/budgets/{task_id}", MethodType.POST),
    GetBudgetTask   ("/budgets/{task_id}"),
    ListBudgetTasks (new TypeReference<List<BudgetTaskResult>>() {}, "/budgets"),

    AmplificationLinkFind   (new TypeReference<LinkFindResult>() {}, "/amplification/link/{id}/find", MethodType.POST)
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
