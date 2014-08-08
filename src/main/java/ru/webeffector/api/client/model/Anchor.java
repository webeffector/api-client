package ru.webeffector.api.client.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author Ernest Sadykov
 * @since 08.08.2014
 */
public class Anchor {
    private String text;
    private Integer count;

    public String getText() {
        return text;
    }

    public void setText(String test) {
        this.text = test;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("text", text)
                .append("count", count)
                .toString();
    }
}
