package ru.webeffector.api.client.util;

import com.fasterxml.jackson.core.type.TypeReference;
import ru.webeffector.api.client.impl.ApiException;
import ru.webeffector.api.client.model.budget.BudgetTaskResult;
import ru.webeffector.api.client.model.campaign.Campaign;
import ru.webeffector.api.client.model.campaign.CampaignLite;
import ru.webeffector.api.client.model.promo.Promotion;

import java.util.List;

/**
 * @author Ernest Sadykov
 * @since 07.08.2014
 */
public enum WebeffectorMethod {
    Token           ("/token", MethodType.POST),

    ListCampaigns   (new TypeReference<List<CampaignLite>>() {}, "/seo"),
    GetCampaign     ("/seo/{id}"),
    CreateCampaign  (new TypeReference<Campaign>() {}, "/seo/{id}", MethodType.POST, new PathRewriter() {
        @Override
        public String rewrite(String path, Object[] args) {
            if (args.length != 1 && !(args[0] instanceof Campaign)) {
                return path;
            }

            String id = ((Campaign) args[0]).getId();
            return path.replace("{id}", id);
        }
    }),

    DeleteCampaign  ("/seo/{id}", MethodType.DELETE),

    GetPromotion    ("/seo/{campaign_id}/{promo_id}"),
    CreatePromotion    ("/seo/{campaign_id}/{promo_id}", MethodType.POST) {
        @Override
        public Class<?> exceptionClass() {
            return Promotion.class;
        }
    },

    AddBudgetTask   ("/budgets/{task_id}", MethodType.POST),
    GetBudgetTask   ("/budgets/{task_id}"),
    ListBudgetTasks (new TypeReference<List<BudgetTaskResult>>() {}, "/budgets"),
    DeleteBudgetTask   ("/budgets/{task_id}", MethodType.DELETE),

    AmplificationLinkFind   ("/amplification/link/{id}/find", MethodType.POST),
    AmplificationSocialActivityFind("/amplification/like/{id}/find", MethodType.POST),
    AmplificationPublicationActivityFind("/amplification/publication/{id}/find", MethodType.POST)
    ;

    private TypeReference<?> returnType;
    private String path;
    private MethodType methodType;
    private PathRewriter rewriter;

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
        this(returnType, path, methodType, null);
    }

    WebeffectorMethod(TypeReference<?> returnType, String path, MethodType methodType, PathRewriter rewriter) {
        this.returnType = returnType;
        this.path = path;
        this.methodType = methodType;
        this.rewriter = rewriter;
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

    public PathRewriter getRewriter() {
        return rewriter;
    }

    public Class<?> exceptionClass() {
        return ApiException.class;
    }
}
