package ru.webeffector.api.client.model.amplification.activity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Alexandr Kolosov
 * @since 01.12.2014
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BehavioralTaskItem {

    private Integer amount;
    private String network;
    private String task;
    private String description;
    private String activityType;
    private String amountPrefix;
    private Double defaultPrice;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @JsonProperty("amount_prefix")
    public String getAmountPrefix() {
        return amountPrefix;
    }

    public void setAmountPrefix(String amountPrefix) {
        this.amountPrefix = amountPrefix;
    }

    @JsonProperty("default_price")
    public Double getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(Double defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("activity_type")
    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

}
