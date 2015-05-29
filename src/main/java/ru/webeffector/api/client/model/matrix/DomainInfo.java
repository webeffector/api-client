package ru.webeffector.api.client.model.matrix;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Sergey Zudin
 * @since 03.03.15.
 */
public class DomainInfo {

    private String domain;

    @Description("Число страниц в индексе яндекса с www")
    private Integer yandexPagesWithWeb;

    @Description("Число страниц в индексе яндекса без www")
    private Integer yandexPagesWithoutWeb;

    @Description("Число страниц в индексе гугла")
    private Integer pagesInGoogle;

    @Description("Код ответа для страницы www.${host}")
    private Integer responseWithWeb;

    @Description("Код ответа для страницы ${host}")
    private Integer responseWithoutWeb;

    @Description("Величина параметра 'мало ссылок'")
    private Integer lowLinksValue;

    @Description("301 редирект на 'с WWW' или на 'без WWW'")
    private Integer mirrorRedirectParameter;

    @Description("Директива 'host:' в robots.txt")
    private Integer hostDirectiveParameter;

    @Description("Наличие в кеше яндекса версий страниц 'с WWW' или на 'без WWW'")
    private Integer pageAmountParameter;

    @Description("Код ответа для несуществующей страницы")
    private Integer notFoundPageResponseCode;

    @Description("Код ответа для главной страницы по протоколу https")
    private Integer securePageResponseCode;

    @Description("Адрес станицы, куда происходит перенаправление")
    private String otherHost;

    @Description("Ответ из сервиса solomono.ru")
    private Map<String, String> solomonoResponse;

    @Description("Ответ из сервиса alexa.com")
    private Map<String, Object> alexaInfo;

    @Description("Графики по количеству доноров и ссылок из сервиса solomono.ru")
    private Map<String, List<String>> solomonoTraffic;

    @Deprecated
    @Description("Ответ из сервиса solomono.ru для конкурентов")
    private List<Map<String, String>> rivalsSolomonos;

    @Description("Содержимое файла robots.txt")
    private String robotsTxt;

    @Description("Доступные sitemap'ы")
    private List<String> siteMaps;

    @Description("Некорректные sitemap'ы")
    private List<String> brokenMaps;

    @Description("Ошибки при обработке карт сайта")
    private List<String> mapParseErrors;

    @Description("Статус фининга для сайта")
    private String malwareStatus;

    @Description("Определенный адрес домена")
    private String resolvedDomain;

    @Description("Дата регистрации в whois")
    private Date whoisDate;

    @Description("Возраст главной страницы сайта")
    private Date rootPageDate;

    @Description("Количество продвижений для проекта")
    private Integer promotionsNumber;

    @Description("Информация из яндекс бара")
    private Map<String, String> barInfo;

    @Description("Page rank")
    private Integer pageRank;

    @Description("Регионы с удачным продвижением")
    private Set<Integer> supportedRegions;

    @Description("Регионы, в которых продвижение не удачно")
    private Set<Integer> unsupportedRegions;

    @Description("Информация о конкурентах домена")
    private List<Map<String, Object>> rivalInfos;

    @Description("Наличие в яндекс справочнике")
    private List<Map<String, Object>> yandexSpravka;

    @Description("Статус верификации из сервиса whois")
    private String verificationState;

    @Description("Категории домена в каталоге DMOZ")
    private List<String> dmozCategories;

    @Description("Информация о запрете главной страницы в robots.txt")
    private Map<String, Object> robotsInfo;

    @Description("Информация о конкурентах в рамках максимального сем ядра для данной тематики согласно spywords")
    private List<Map<String, Object>> spyWordsResponses;

    @Description("Наибольшая видимость для домена?")
    private boolean isHighestVisibility;

    @Description("Информация о домене")
    private Map<String, Object> webmasterDomainInfo;

    @Deprecated
    @Description("Конкуренты домена")
    private List<String> rivals;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Integer getYandexPagesWithWeb() {
        return yandexPagesWithWeb;
    }

    public void setYandexPagesWithWeb(Integer yandexPagesWithWeb) {
        this.yandexPagesWithWeb = yandexPagesWithWeb;
    }

    public Integer getYandexPagesWithoutWeb() {
        return yandexPagesWithoutWeb;
    }

    public void setYandexPagesWithoutWeb(Integer yandexPagesWithoutWeb) {
        this.yandexPagesWithoutWeb = yandexPagesWithoutWeb;
    }

    public Integer getPagesInGoogle() {
        return pagesInGoogle;
    }

    public void setPagesInGoogle(Integer pagesInGoogle) {
        this.pagesInGoogle = pagesInGoogle;
    }

    public Integer getResponseWithWeb() {
        return responseWithWeb;
    }

    public void setResponseWithWeb(Integer responseWithWeb) {
        this.responseWithWeb = responseWithWeb;
    }

    public Integer getResponseWithoutWeb() {
        return responseWithoutWeb;
    }

    public void setResponseWithoutWeb(Integer responseWithoutWeb) {
        this.responseWithoutWeb = responseWithoutWeb;
    }

    public Integer getLowLinksValue() {
        return lowLinksValue;
    }

    public void setLowLinksValue(Integer lowLinksValue) {
        this.lowLinksValue = lowLinksValue;
    }

    public Integer getMirrorRedirectParameter() {
        return mirrorRedirectParameter;
    }

    public void setMirrorRedirectParameter(Integer mirrorRedirectParameter) {
        this.mirrorRedirectParameter = mirrorRedirectParameter;
    }

    public Integer getHostDirectiveParameter() {
        return hostDirectiveParameter;
    }

    public void setHostDirectiveParameter(Integer hostDirectiveParameter) {
        this.hostDirectiveParameter = hostDirectiveParameter;
    }

    public Integer getPageAmountParameter() {
        return pageAmountParameter;
    }

    public void setPageAmountParameter(Integer pageAmountParameter) {
        this.pageAmountParameter = pageAmountParameter;
    }

    public Integer getNotFoundPageResponseCode() {
        return notFoundPageResponseCode;
    }

    public void setNotFoundPageResponseCode(Integer notFoundPageResponseCode) {
        this.notFoundPageResponseCode = notFoundPageResponseCode;
    }

    public Integer getSecurePageResponseCode() {
        return securePageResponseCode;
    }

    public void setSecurePageResponseCode(Integer securePageResponseCode) {
        this.securePageResponseCode = securePageResponseCode;
    }

    public String getOtherHost() {
        return otherHost;
    }

    public void setOtherHost(String otherHost) {
        this.otherHost = otherHost;
    }

    public Map<String, String> getSolomonoResponse() {
        return solomonoResponse;
    }

    public void setSolomonoResponse(Map<String, String> solomonoResponse) {
        this.solomonoResponse = solomonoResponse;
    }

    public Map<String, Object> getAlexaInfo() {
        return alexaInfo;
    }

    public void setAlexaInfo(Map<String, Object> alexaInfo) {
        this.alexaInfo = alexaInfo;
    }

    public Map<String, List<String>> getSolomonoTraffic() {
        return solomonoTraffic;
    }

    public void setSolomonoTraffic(Map<String, List<String>> solomonoTraffic) {
        this.solomonoTraffic = solomonoTraffic;
    }

    public List<Map<String, String>> getRivalsSolomonos() {
        return rivalsSolomonos;
    }

    public void setRivalsSolomonos(List<Map<String, String>> rivalsSolomonos) {
        this.rivalsSolomonos = rivalsSolomonos;
    }

    public String getRobotsTxt() {
        return robotsTxt;
    }

    public void setRobotsTxt(String robotsTxt) {
        this.robotsTxt = robotsTxt;
    }

    public List<String> getSiteMaps() {
        return siteMaps;
    }

    public void setSiteMaps(List<String> siteMaps) {
        this.siteMaps = siteMaps;
    }

    public List<String> getBrokenMaps() {
        return brokenMaps;
    }

    public void setBrokenMaps(List<String> brokenMaps) {
        this.brokenMaps = brokenMaps;
    }

    public List<String> getMapParseErrors() {
        return mapParseErrors;
    }

    public void setMapParseErrors(List<String> mapParseErrors) {
        this.mapParseErrors = mapParseErrors;
    }

    public String getMalwareStatus() {
        return malwareStatus;
    }

    public void setMalwareStatus(String malwareStatus) {
        this.malwareStatus = malwareStatus;
    }

    public String getResolvedDomain() {
        return resolvedDomain;
    }

    public void setResolvedDomain(String resolvedDomain) {
        this.resolvedDomain = resolvedDomain;
    }

    public Date getWhoisDate() {
        return whoisDate;
    }

    public void setWhoisDate(Date whoisDate) {
        this.whoisDate = whoisDate;
    }

    public Date getRootPageDate() {
        return rootPageDate;
    }

    public void setRootPageDate(Date rootPageDate) {
        this.rootPageDate = rootPageDate;
    }

    public Integer getPromotionsNumber() {
        return promotionsNumber;
    }

    public void setPromotionsNumber(Integer promotionsNumber) {
        this.promotionsNumber = promotionsNumber;
    }

    public Map<String, String> getBarInfo() {
        return barInfo;
    }

    public void setBarInfo(Map<String, String> barInfo) {
        this.barInfo = barInfo;
    }

    public Integer getPageRank() {
        return pageRank;
    }

    public void setPageRank(Integer pageRank) {
        this.pageRank = pageRank;
    }

    public Set<Integer> getSupportedRegions() {
        return supportedRegions;
    }

    public void setSupportedRegions(Set<Integer> supportedRegions) {
        this.supportedRegions = supportedRegions;
    }

    public Set<Integer> getUnsupportedRegions() {
        return unsupportedRegions;
    }

    public void setUnsupportedRegions(Set<Integer> unsupportedRegions) {
        this.unsupportedRegions = unsupportedRegions;
    }

    public List<Map<String, Object>> getRivalInfos() {
        return rivalInfos;
    }

    public void setRivalInfos(List<Map<String, Object>> rivalInfos) {
        this.rivalInfos = rivalInfos;
    }

    public List<Map<String, Object>> getYandexSpravka() {
        return yandexSpravka;
    }

    public void setYandexSpravka(List<Map<String, Object>> yandexSpravka) {
        this.yandexSpravka = yandexSpravka;
    }

    public String getVerificationState() {
        return verificationState;
    }

    public void setVerificationState(String verificationState) {
        this.verificationState = verificationState;
    }

    public List<String> getDmozCategories() {
        return dmozCategories;
    }

    public void setDmozCategories(List<String> dmozCategories) {
        this.dmozCategories = dmozCategories;
    }

    public Map<String, Object> getRobotsInfo() {
        return robotsInfo;
    }

    public void setRobotsInfo(Map<String, Object> robotsInfo) {
        this.robotsInfo = robotsInfo;
    }

    public List<Map<String, Object>> getSpyWordsResponses() {
        return spyWordsResponses;
    }

    public void setSpyWordsResponses(List<Map<String, Object>> spyWordsResponses) {
        this.spyWordsResponses = spyWordsResponses;
    }

    public boolean isHighestVisibility() {
        return isHighestVisibility;
    }

    public void setHighestVisibility(boolean isHighestVisibility) {
        this.isHighestVisibility = isHighestVisibility;
    }

    public Map<String, Object> getWebmasterDomainInfo() {
        return webmasterDomainInfo;
    }

    public void setWebmasterDomainInfo(Map<String, Object> webmasterDomainInfo) {
        this.webmasterDomainInfo = webmasterDomainInfo;
    }

    public List<String> getRivals() {
        return rivals;
    }

    public void setRivals(List<String> rivals) {
        this.rivals = rivals;
    }
}
