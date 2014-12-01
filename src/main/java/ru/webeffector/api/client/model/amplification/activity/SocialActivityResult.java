package ru.webeffector.api.client.model.amplification.activity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * @author Alexandr Kolosov
 * @since 01.12.2014
 */
public class SocialActivityResult {

    private boolean success;
    private Map<String, SocialPageInfo> likeTasks;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @JsonProperty("like_tasks")
    public Map<String, SocialPageInfo> getLikeTasks() {
        return likeTasks;
    }

    public void setLikeTasks(Map<String, SocialPageInfo> likeTasks) {
        this.likeTasks = likeTasks;
    }
}
