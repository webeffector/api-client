package ru.webeffector.api.client.model.budget;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * @author Ernest Sadykov
 * @since 28.08.2014
 */
public class QueryResult extends Query {

    private BigDecimal cost;

    @JsonProperty(value = "currentPositionNumber")
    private Double currentPositionNumber;

    @JsonProperty("currentPositionMoreThanNumber")
    private Integer currentPositionMoreThanNumber;

    @JsonProperty("currentPositionUrl")
    private String currentPositionUrl;

    @JsonProperty("isGeoDependent")
    private Boolean geoDependent;

    @JsonProperty("promotionTerm")
    private Double promotionTerm;

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Double getCurrentPositionNumber() {
        return currentPositionNumber;
    }

    public void setCurrentPositionNumber(Double currentPositionNumber) {
        this.currentPositionNumber = currentPositionNumber;
    }

    public Integer getCurrentPositionMoreThanNumber() {
        return currentPositionMoreThanNumber;
    }

    public void setCurrentPositionMoreThanNumber(Integer currentPositionMoreThanNumber) {
        this.currentPositionMoreThanNumber = currentPositionMoreThanNumber;
    }

    public String getCurrentPositionUrl() {
        return currentPositionUrl;
    }

    public void setCurrentPositionUrl(String currentPositionUrl) {
        this.currentPositionUrl = currentPositionUrl;
    }

    public Boolean isGeoDependent() {
        return geoDependent;
    }

    public void setGeoDependent(Boolean geoDependent) {
        this.geoDependent = geoDependent;
    }

    public Double getPromotionTerm() {
        return promotionTerm;
    }

    public void setPromotionTerm(Double promotionTerm) {
        this.promotionTerm = promotionTerm;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("url", url)
                .append("position", position)
                .append("phrase", phrase)
                .append("cost", cost)
                .append("currentPositionNumber", currentPositionNumber)
                .append("currentPositionMoreThanNumber", currentPositionMoreThanNumber)
                .append("currentPositionUrl", currentPositionUrl)
                .append("geoDependent", geoDependent)
                .append("promotionTerm", promotionTerm)
                .toString();
    }
}
