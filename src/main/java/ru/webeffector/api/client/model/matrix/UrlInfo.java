package ru.webeffector.api.client.model.matrix;

import java.util.Date;
import java.util.Map;

/**
 * @author Sergey Zudin
 * @since 06.03.15.
 */
public class UrlInfo {

    @Description("Адрес страницы")
    private String pageUrl;

    @Description("Дата последнего обновления процессора")
    private Map<String, Date> updateInfo;

    @Description("Сведения об уникальности станицы")
    private Map<String, Object> checkInfo;

    @Description("Ошибка при получении содержимого страницы")
    private String fetchingError;

    @Description("Информация о содержимом страницы")
    private Map<String, Object> contentInfo;

    @Description("Код статуса страницы при проверке из Германии")
    private Integer responseCode;

    @Description("Адрес станицы, куда происходит перенаправление")
    private String otherHost;

    @Description("Объявлена ли страница в сайтмапе")
    private Boolean isAllowedInSitemap;

    @Deprecated
    @Description("Дата съема")
    private Date date;

    @Description
    private Map<String, String> robotsInfo;

    @Description("Дата съема уникального контента")
    private Date uniqueHarvestDate;

    @Description("Информация о социальных виджетах на странице")
    private Map<String, Boolean> widgetsInfo;

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public Map<String, Date> getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(Map<String, Date> updateInfo) {
        this.updateInfo = updateInfo;
    }

    public Map<String, Object> getCheckInfo() {
        return checkInfo;
    }

    public void setCheckInfo(Map<String, Object> checkInfo) {
        this.checkInfo = checkInfo;
    }

    public String getFetchingError() {
        return fetchingError;
    }

    public void setFetchingError(String fetchingError) {
        this.fetchingError = fetchingError;
    }

    public Map<String, Object> getContentInfo() {
        return contentInfo;
    }

    public void setContentInfo(Map<String, Object> contentInfo) {
        this.contentInfo = contentInfo;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public String getOtherHost() {
        return otherHost;
    }

    public void setOtherHost(String otherHost) {
        this.otherHost = otherHost;
    }

    public Boolean getIsAllowedInSitemap() {
        return isAllowedInSitemap;
    }

    public void setIsAllowedInSitemap(Boolean isAllowedInSitemap) {
        this.isAllowedInSitemap = isAllowedInSitemap;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<String, String> getRobotsInfo() {
        return robotsInfo;
    }

    public void setRobotsInfo(Map<String, String> robotsInfo) {
        this.robotsInfo = robotsInfo;
    }

    public Date getUniqueHarvestDate() {
        return uniqueHarvestDate;
    }

    public void setUniqueHarvestDate(Date uniqueHarvestDate) {
        this.uniqueHarvestDate = uniqueHarvestDate;
    }

    public Map<String, Boolean> getWidgetsInfo() {
        return widgetsInfo;
    }

    public void setWidgetsInfo(Map<String, Boolean> widgetsInfo) {
        this.widgetsInfo = widgetsInfo;
    }
}
