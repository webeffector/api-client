package ru.webeffector.api.client.model.promo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author Ernest Sadykov
 * @since 07.08.2014
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PromotionLite {

    private BigDecimal dayCost;
    private Map<SearchEngine, Integer> positions;
    private Map<SearchEngine, Integer> yesterdayPositions;
    private Map<SearchEngine, String> searcherUrl;
    private String id;
    private Integer hits;
    private Integer linksBought;
    private String word;
    private String url;
    private BigDecimal recommendedBudget;
    private YandexGeo yandexGeo;
    private Integer position;
    private PromoState state;
    private BigDecimal budget;
    private Integer seoPressing;
    private Integer shows;
    private BudgetType budgetType;

    public BigDecimal getDayCost() {
        return dayCost;
    }

    public void setDayCost(BigDecimal dayCost) {
        this.dayCost = dayCost;
    }

    public Map<SearchEngine, Integer> getPositions() {
        return positions;
    }

    public void setPositions(Map<SearchEngine, Integer> positions) {
        this.positions = positions;
    }

    public Map<SearchEngine, Integer> getYesterdayPositions() {
        return yesterdayPositions;
    }

    public void setYesterdayPositions(Map<SearchEngine, Integer> yesterdayPositions) {
        this.yesterdayPositions = yesterdayPositions;
    }

    public Map<SearchEngine, String> getSearcherUrl() {
        return searcherUrl;
    }

    public void setSearcherUrl(Map<SearchEngine, String> searcherUrl) {
        this.searcherUrl = searcherUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getLinksBought() {
        return linksBought;
    }

    public void setLinksBought(Integer linksBought) {
        this.linksBought = linksBought;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BigDecimal getRecommendedBudget() {
        return recommendedBudget;
    }

    public void setRecommendedBudget(BigDecimal recommendedBudget) {
        this.recommendedBudget = recommendedBudget;
    }

    public YandexGeo getYandexGeo() {
        return yandexGeo;
    }

    public void setYandexGeo(YandexGeo yandexGeo) {
        this.yandexGeo = yandexGeo;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public PromoState getState() {
        return state;
    }

    public void setState(PromoState state) {
        this.state = state;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public Integer getSeoPressing() {
        return seoPressing;
    }

    public void setSeoPressing(Integer seoPressing) {
        this.seoPressing = seoPressing;
    }

    public Integer getShows() {
        return shows;
    }

    public void setShows(Integer shows) {
        this.shows = shows;
    }

    public BudgetType getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(BudgetType budgetType) {
        this.budgetType = budgetType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("dayCost", dayCost)
                .append("positions", positions)
                .append("yesterdayPositions", yesterdayPositions)
                .append("searcherUrl", searcherUrl)
                .append("id", id)
                .append("hits", hits)
                .append("linksBought", linksBought)
                .append("word", word)
                .append("url", url)
                .append("recommendedBudget", recommendedBudget)
                .append("yandexGeo", yandexGeo)
                .append("position", position)
                .append("state", state)
                .append("budget", budget)
                .append("seoPressing", seoPressing)
                .append("shows", shows)
                .toString();
    }
}
