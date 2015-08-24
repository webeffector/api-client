package ru.webeffector.api.client.util;

import com.fasterxml.jackson.core.type.TypeReference;
import ru.webeffector.api.client.impl.ApiException;
import ru.webeffector.api.client.model.budget.BudgetTaskResult;
import ru.webeffector.api.client.model.campaign.Campaign;
import ru.webeffector.api.client.model.campaign.CampaignLite;
import ru.webeffector.api.client.model.matrix.DomainInfo;
import ru.webeffector.api.client.model.matrix.ParameterInfo;
import ru.webeffector.api.client.model.matrix.PromoInfo;
import ru.webeffector.api.client.model.matrix.UrlInfo;
import ru.webeffector.api.client.model.promo.Promotion;

import java.util.List;
import java.util.Map;

/**
 * @author Ernest Sadykov
 * @since 07.08.2014
 */
public enum WebeffectorMethod implements MethodDefinition {
    Token           ("/token", MethodType.POST),

    ListCampaigns   (new TypeReference<List<CampaignLite>>() {}, "/seo"),
    GetCampaign     ("/seo/{id}"),
    CreateCampaign  (new TypeReference<Campaign>() {}, "/seo/{id}", MethodType.POST, RewriterHelper.campaignRewriter),

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
    AmplificationPublicationActivityFind("/amplification/publication/{id}/find", MethodType.POST),
   
    /* --- Matrix methods --- */

    /* Domain */
    MatrixDomainSchedule(new TypeReference<Map<String, Object>>(){}, "/matrix/domain/schedule", MethodType.POST, RewriterHelper.processorsRewriter),
    MatrixDomainView("/matrix/domain/view", MethodType.POST),
    MatrixDomainUpdate(new TypeReference<DomainInfo>(){}, "/matrix/domain/update", MethodType.POST, RewriterHelper.processorsRewriter),
    MatrixDomainResult("/matrix/result?correlationId={correlationId}"),
    MatrixDomainProcessors("/matrix/domain/processors"),
    MatrixDomainOptions("/matrix/domain", MethodType.OPTIONS),

    /* Url */
    MatrixUrlSchedule(new TypeReference<Map<String, Object>>(){}, "/matrix/url/schedule", MethodType.POST, RewriterHelper.processorsRewriter),
    MatrixUrlView("/matrix/url/view", MethodType.POST),
    MatrixUrlUpdate(new TypeReference<UrlInfo>(){}, "/matrix/url/update", MethodType.POST, RewriterHelper.processorsRewriter),
    MatrixUrlResult("/matrix/result?correlationId={correlationId}"),
    MatrixUrlProcessors("/matrix/url/processors"),
    MatrixUrlOptions("/matrix/url", MethodType.OPTIONS),

    /* Promo */
    MatrixPromoSchedule(new TypeReference<Map<String, Object>>(){}, "/matrix/promo/schedule", MethodType.POST, RewriterHelper.processorsRewriter),
    MatrixPromoView("/matrix/promo/view", MethodType.POST),
    MatrixPromoUpdate(new TypeReference<PromoInfo>(){}, "/matrix/promo/update", MethodType.POST, RewriterHelper.processorsRewriter),
    MatrixPromoResult("/matrix/result?correlationId={correlationId}"),
    MatrixPromoProcessors("/matrix/promo/processors"),
    MatrixPromoOptions("/matrix/promo", MethodType.OPTIONS),

    /* Project */
    MatrixProjectSchedule(new TypeReference<Map<String, Object>>(){}, "/matrix/project/schedule", MethodType.POST, RewriterHelper.processorsRewriter),
    MatrixProjectView("/matrix/project/view", MethodType.POST),
    MatrixProjectUpdate(new TypeReference<Map<Long, PromoInfo>>(){}, "/matrix/project/update", MethodType.POST, RewriterHelper.processorsRewriter),
    MatrixProjectResult("/matrix/result?correlationId={correlationId}"),
    MatrixProjectProcessors("/matrix/project/processors"),
    MatrixProjectOptions("/matrix/project", MethodType.OPTIONS),

    /* Parameter */
    MatrixParameterSchedule(new TypeReference<Map<String, Object>>(){}, "/matrix/{parameterName}/schedule", MethodType.POST, RewriterHelper.parameterRewriter),
    MatrixParameterView("/matrix/parameter/view", MethodType.POST),
    MatrixParameterUpdate(new TypeReference<ParameterInfo>(){}, "/matrix/{parameterName}/update", MethodType.POST, RewriterHelper.parameterRewriter),
    MatrixParameterResult("/matrix/result?correlationId={correlationId}"),
    MatrixParameterProcessors("/matrix/parameter/processors"),
    MatrixParameters("/matrix/parameters"),
    MatrixParameterOptions("/matrix/{parameterName}", MethodType.OPTIONS),

    /* --- End of matrix methods --- */
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

    
    
    public static class RewriterHelper {

        public static final PathRewriter campaignRewriter = new PathRewriter() {
            @Override
            public String rewrite(String path, Object[] args) {
                if (args.length != 1 && !(args[0] instanceof Campaign)) {
                    return path;
                }

                String id = ((Campaign) args[0]).getId();
                return path.replace("{id}", id);
            }
        };
        
        public static final PathRewriter processorsRewriter = getMatrixRewriter(1);
        public static final PathRewriter parameterRewriter = getMatrixRewriter(2);
        
        private static PathRewriter getMatrixRewriter(final int firstProc) {
            return new PathRewriter() {
                @Override
                public String rewrite(String path, Object[] args) {
                    StringBuilder builder = new StringBuilder(path);
                    if (args.length > firstProc) {
                        String[] processors = (String[]) args[firstProc];
                        for (int i = 0; i < processors.length; i++) {
                            String start = i == 0 ? "?" : "&";
                            builder.append(start).append("processors").append(processors[i]);
                        }
                    }
                    return builder.toString();
                }
            };
        }
    }    
}
