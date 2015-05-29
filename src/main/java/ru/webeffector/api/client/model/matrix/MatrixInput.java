package ru.webeffector.api.client.model.matrix;

import java.net.URL;

/**
 * @author Sergey Zudin
 * @since 27.05.15.
 */
public class MatrixInput {

    private URL pageUrl;

    private String searchQuery;

    private long projectId;

    private long promotionId;

    private int regionId;

    public URL getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(URL pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(long promotionId) {
        this.promotionId = promotionId;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }
}
