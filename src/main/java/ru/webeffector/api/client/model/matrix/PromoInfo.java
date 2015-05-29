package ru.webeffector.api.client.model.matrix;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Sergey Zudin
 * @since 06.03.15.
 */
public class PromoInfo {

    @Description("Индетификатор продвижения")
    private int id;

    @Description("Дата последнего обновления процессора")
    private Map<String, Date> updateInfo;

    @Deprecated
    @Description("Дата последнего съема")
    private Date date;

    @Description("Информация о домене")
    private DomainInfo domainInfo;

    @Description("Информация о странице")
    private UrlInfo urlInfo;

    @Description("Число вхождений запроса в контент страницы")
    private Integer numberOfOccurrences;

    @Description("Конкуренты для запроса")
    private List<String> rivals;

    @Description
    private List<String> errors;

    @Description("Релевантная для запроса страница")
    private String relevantPage;

    @Description("Текущий бюджет продвижения")
    private Double currentBudget;

    @Description("Рекомендуемый бюджет продвижения")
    private Double recommendedBudget;

    @Description("Запрос найден по ссылке")
    private Boolean isFoundByReference;

    @Description("Тип конкурентности запроса")
    private String competitionType;

    @Description("Нет вхождения в заголовке title: Если СК или ВК запрос не находится в ТОП 10 и в заголовке title нет вхождений всех слов")
    private Boolean customTitleOccurrence;

    @Description("Нет вхождения в keywords")
    private Boolean customKeywordsOccurrence;

    @Description("Нет вхождения в description")
    private Boolean customDescriptionOccurrence;

    @Description("Последняя снятая позиция в яндексе")
    private Integer yandexLastPosition;

    @Description("Количество заголовков верхнего уровня, содержащих запрос")
    private Integer numberOfHeaders;

    @Description("Информация о заспамленности страницы по сравнению с конкурентами")
    private Map<String, Object> spamInfo;

    @Description("Величина заспамленности")
    private Double spamFactor;

    @Description("Наличие быстрых ссылок")
    private Boolean hasQuickLinks;

    @Description("Наличие навигационной цепочки")
    private Boolean hasNavigationLinks;

    @Description("Соответствует ли адрес страницы продвигаемому запросу согласно алгоритму ЧПУ")
    private Boolean isHumanReadable;

    @Description("Проидексирован ли в яндексе с учетом региона?")
    private Boolean inYandexIndex;

    @Description("Список регионов, указанных в поисковом запросе")
    private List<Integer> geoDependecy;

    private long projectId;

    private int regionId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String, Date> getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(Map<String, Date> updateInfo) {
        this.updateInfo = updateInfo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public DomainInfo getDomainInfo() {
        return domainInfo;
    }

    public void setDomainInfo(DomainInfo domainInfo) {
        this.domainInfo = domainInfo;
    }

    public UrlInfo getUrlInfo() {
        return urlInfo;
    }

    public void setUrlInfo(UrlInfo urlInfo) {
        this.urlInfo = urlInfo;
    }

    public Integer getNumberOfOccurrences() {
        return numberOfOccurrences;
    }

    public void setNumberOfOccurrences(Integer numberOfOccurrences) {
        this.numberOfOccurrences = numberOfOccurrences;
    }

    public List<String> getRivals() {
        return rivals;
    }

    public void setRivals(List<String> rivals) {
        this.rivals = rivals;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public String getRelevantPage() {
        return relevantPage;
    }

    public void setRelevantPage(String relevantPage) {
        this.relevantPage = relevantPage;
    }

    public Double getCurrentBudget() {
        return currentBudget;
    }

    public void setCurrentBudget(Double currentBudget) {
        this.currentBudget = currentBudget;
    }

    public Double getRecommendedBudget() {
        return recommendedBudget;
    }

    public void setRecommendedBudget(Double recommendedBudget) {
        this.recommendedBudget = recommendedBudget;
    }

    public Boolean getIsFoundByReference() {
        return isFoundByReference;
    }

    public void setIsFoundByReference(Boolean isFoundByReference) {
        this.isFoundByReference = isFoundByReference;
    }

    public String getCompetitionType() {
        return competitionType;
    }

    public void setCompetitionType(String competitionType) {
        this.competitionType = competitionType;
    }

    public Boolean getCustomTitleOccurrence() {
        return customTitleOccurrence;
    }

    public void setCustomTitleOccurrence(Boolean customTitleOccurrence) {
        this.customTitleOccurrence = customTitleOccurrence;
    }

    public Boolean getCustomKeywordsOccurrence() {
        return customKeywordsOccurrence;
    }

    public void setCustomKeywordsOccurrence(Boolean customKeywordsOccurrence) {
        this.customKeywordsOccurrence = customKeywordsOccurrence;
    }

    public Boolean getCustomDescriptionOccurrence() {
        return customDescriptionOccurrence;
    }

    public void setCustomDescriptionOccurrence(Boolean customDescriptionOccurrence) {
        this.customDescriptionOccurrence = customDescriptionOccurrence;
    }

    public Integer getYandexLastPosition() {
        return yandexLastPosition;
    }

    public void setYandexLastPosition(Integer yandexLastPosition) {
        this.yandexLastPosition = yandexLastPosition;
    }

    public Integer getNumberOfHeaders() {
        return numberOfHeaders;
    }

    public void setNumberOfHeaders(Integer numberOfHeaders) {
        this.numberOfHeaders = numberOfHeaders;
    }

    public Map<String, Object> getSpamInfo() {
        return spamInfo;
    }

    public void setSpamInfo(Map<String, Object> spamInfo) {
        this.spamInfo = spamInfo;
    }

    public Double getSpamFactor() {
        return spamFactor;
    }

    public void setSpamFactor(Double spamFactor) {
        this.spamFactor = spamFactor;
    }

    public Boolean getHasQuickLinks() {
        return hasQuickLinks;
    }

    public void setHasQuickLinks(Boolean hasQuickLinks) {
        this.hasQuickLinks = hasQuickLinks;
    }

    public Boolean getHasNavigationLinks() {
        return hasNavigationLinks;
    }

    public void setHasNavigationLinks(Boolean hasNavigationLinks) {
        this.hasNavigationLinks = hasNavigationLinks;
    }

    public Boolean getIsHumanReadable() {
        return isHumanReadable;
    }

    public void setIsHumanReadable(Boolean isHumanReadable) {
        this.isHumanReadable = isHumanReadable;
    }

    public Boolean getInYandexIndex() {
        return inYandexIndex;
    }

    public void setInYandexIndex(Boolean inYandexIndex) {
        this.inYandexIndex = inYandexIndex;
    }

    public List<Integer> getGeoDependecy() {
        return geoDependecy;
    }

    public void setGeoDependecy(List<Integer> geoDependecy) {
        this.geoDependecy = geoDependecy;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }
}
