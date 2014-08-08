package ru.webeffector.api.client.model.campaign;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import ru.webeffector.api.client.model.promo.PromotionLite;
import ru.webeffector.api.client.model.promo.SearchEngine;

import java.util.List;
import java.util.Map;

/**
 * @author Ernest Sadykov
 * @since 07.08.2014
 */
public class Campaign extends CampaignLite {

    private List<PromotionLite> promos;
    private Map<SearchEngine, Double> success;

    public List<PromotionLite> getPromos() {
        return promos;
    }

    public void setPromos(List<PromotionLite> promos) {
        this.promos = promos;
    }

    public Map<SearchEngine, Double> getSuccess() {
        return success;
    }

    public void setSuccess(Map<SearchEngine, Double> success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("id", getId())
                .append("region", getRegion())
                .append("name", getName())
                .append("url", getUrl())
                .append("pos", getPos())
                .append("top", getTop())
                .append("comment", getComment())
                .append("dayCost", getDayCost())
                .append("budget", getBudget())
                .append("state", getState())
                .append("promos", promos)
                .append("success", success)
                .toString();
    }
}
