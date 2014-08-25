package ru.webeffector.api.client.model.budget;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author Ernest Sadykov
 * @since 25.08.2014
 */
public class Query {

    String url;
    Integer position;
    String phrase;

    public Query() {
    }

    public Query(String url, Integer position, String phrase) {
        this.url = url;
        this.position = position;
        this.phrase = phrase;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("url", url)
                .append("position", position)
                .append("phrase", phrase)
                .toString();
    }
}
