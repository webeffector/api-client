package ru.webeffector.api.client.model.amplification.link;

import java.util.List;

/**
 * @author Alexandr Kolosov
 * @since 04.09.2014
 */
public class LinkFindResult {

    private boolean success;
    private List<AnchorInfo> anchors;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<AnchorInfo> getAnchors() {
        return anchors;
    }

    public void setAnchors(List<AnchorInfo> anchors) {
        this.anchors = anchors;
    }
}
