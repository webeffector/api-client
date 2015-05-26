package ru.webeffector.api.client.model.amplification.activity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * @author Ernest Sadykov
 * @since 26.05.2015
 */
public class PublicationSocialActivityResult extends SocialActivityResult {

    private Map<String, SocialPageInfo> publicationTasks;

    @JsonProperty("publication_tasks")
    public Map<String, SocialPageInfo> getPublicationTasks() {
        return publicationTasks;
    }

    public void setPublicationTasks(Map<String, SocialPageInfo> publicationTasks) {
        this.publicationTasks = publicationTasks;
    }
}
