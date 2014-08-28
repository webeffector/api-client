package ru.webeffector.api.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.joda.time.LocalDate;

import java.math.BigDecimal;
import java.net.URL;

/**
 * @author Ernest Sadykov
 * @since 08.08.2014
 */
public class Link {

    private Integer id;
    private LocalDate date;
    private URL url;
    private String text;
    private BigDecimal price;

    @JsonProperty("indexed_by_yandex")
    private Boolean indexedByYandex;

    @JsonProperty("indexed_by_google")
    private Boolean indexedByGoogle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getIndexedByYandex() {
        return indexedByYandex;
    }

    public void setIndexedByYandex(Boolean indexedByYandex) {
        this.indexedByYandex = indexedByYandex;
    }

    public Boolean getIndexedByGoogle() {
        return indexedByGoogle;
    }

    public void setIndexedByGoogle(Boolean indexedByGoogle) {
        this.indexedByGoogle = indexedByGoogle;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("id", id)
                .append("date", date)
                .append("url", url)
                .append("text", text)
                .append("price", price)
                .append("indexedByYandex", indexedByYandex)
                .append("indexedByGoogle", indexedByGoogle)
                .toString();
    }
}
