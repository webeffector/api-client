package ru.webeffector.api.client.model.amplification.activity;

import java.util.List;

/**
 * @author Alexandr Kolosov
 * @since 01.12.2014
 */
public class SocialPageInfo {

    private String title;
    private String network;
    private List<BehavioralTaskItem> items;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public List<BehavioralTaskItem> getItems() {
        return items;
    }

    public void setItems(List<BehavioralTaskItem> items) {
        this.items = items;
    }
}