package ru.webeffector.api.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Ernest Sadykov
 * @since 30.07.2014
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Campaign {
    private String id;

    private String region;

    private String name;

    private String url;

    private String mode;

    private List<String> pos;

    private List<String> top;

    private String comment;

    private Double dayCost;

    private Double budget;

    @JsonProperty("behaviorals_budget")
    private Double behavioralsBudget;

    @JsonProperty("behaviorals_expense")
    private Double behavioralsExpense;

    private String state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public List<String> getPos() {
        return pos;
    }

    public void setPos(List<String> pos) {
        this.pos = pos;
    }

    public List<String> getTop() {
        return top;
    }

    public void setTop(List<String> top) {
        this.top = top;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Double getDayCost() {
        return dayCost;
    }

    public void setDayCost(Double dayCost) {
        this.dayCost = dayCost;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Double getBehavioralsBudget() {
        return behavioralsBudget;
    }

    public void setBehavioralsBudget(Double behavioralsBudget) {
        this.behavioralsBudget = behavioralsBudget;
    }

    public Double getBehavioralsExpense() {
        return behavioralsExpense;
    }

    public void setBehavioralsExpense(Double behavioralsExpense) {
        this.behavioralsExpense = behavioralsExpense;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
