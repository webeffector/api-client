package ru.webeffector.api.client.model.amplification.activity;

/**
 * @author Alexandr Kolosov
 * @since 01.12.2014
 */
public abstract class SocialActivityResult {

    private boolean success;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
