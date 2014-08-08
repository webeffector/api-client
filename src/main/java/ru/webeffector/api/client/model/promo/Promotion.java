package ru.webeffector.api.client.model.promo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.joda.time.LocalDate;
import ru.webeffector.api.client.model.Anchor;
import ru.webeffector.api.client.model.Link;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;

/**
 * @author Ernest Sadykov
 * @since 08.08.2014
 */
public class Promotion extends PromotionLite {

    private List<Anchor> anchors;
    private List<Link> links;
    private Map<SearchEngine, SortedMap<LocalDate, Integer>> trends;

    public List<Anchor> getAnchors() {
        return anchors;
    }

    public void setAnchors(List<Anchor> anchors) {
        this.anchors = anchors;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public Map<SearchEngine, SortedMap<LocalDate, Integer>> getTrends() {
        return trends;
    }

    public void setTrends(Map<SearchEngine, SortedMap<LocalDate, Integer>> trends) {
        this.trends = trends;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("trends", trends)
                .append("links", links)
                .append("anchors", anchors)
                .toString();
    }
}
