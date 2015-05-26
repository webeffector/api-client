package ru.webeffector.api.client.model.amplification.activity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * @author Ernest Sadykov
 * @since 26.05.2015
 */
public class ExternalSocialActivityResult extends SocialActivityResult {

    private Map<String, SocialPageInfo> likeTasks;

    @JsonProperty("like_tasks")
    public Map<String, SocialPageInfo> getLikeTasks() {
        return likeTasks;
    }

    public void setLikeTasks(Map<String, SocialPageInfo> likeTasks) {
        this.likeTasks = likeTasks;
    }
}
