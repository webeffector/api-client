package ru.webeffector.api.client.model.amplification.link;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author Alexandr Kolosov
 * @since 04.09.2014
 */
public class AnchorInfo {

    private String lookupUrl;
    private String targetUrl;
    private String anchor;

    @JsonProperty("target_url")
    public String getTargetUrl() {
        return targetUrl;
    }

    @JsonProperty("target_url")
    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

    @JsonProperty("lookup_url")
    public String getLookupUrl() {
        return lookupUrl;
    }

    @JsonProperty("lookup_url")
    public void setLookupUrl(String lookupUrl) {
        this.lookupUrl = lookupUrl;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("lookupUrl", lookupUrl)
                .append("targetUrl", targetUrl)
                .append("anchor", anchor)
                .toString();
    }
}
