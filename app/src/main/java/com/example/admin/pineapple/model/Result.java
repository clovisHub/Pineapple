
package com.example.admin.pineapple.model;

import java.util.List;
import com.squareup.moshi.Json;

public class Result {

    @Json(name = "assetTopics")
    private List<AssetTopic> assetTopics = null;
    @Json(name = "salesEndDate")
    private String salesEndDate;
    @Json(name = "registrationUrlAdr")
    private String registrationUrlAdr;
    @Json(name = "retryDate")
    private String retryDate;
    @Json(name = "assetLegacyData")
    private AssetLegacyData assetLegacyData;
    @Json(name = "activityEndDate")
    private String activityEndDate;
    @Json(name = "assetServiceHostName")
    private String assetServiceHostName;
    @Json(name = "activityStartDate")
    private String activityStartDate;
    @Json(name = "localTimeZoneId")
    private String localTimeZoneId;
    @Json(name = "modifiedDate")
    private String modifiedDate;
    @Json(name = "currencyCd")
    private String currencyCd;
    @Json(name = "sourceSystem")
    private SourceSystem sourceSystem;
    @Json(name = "place")
    private Place place;
    @Json(name = "urlAdr")
    private String urlAdr;
    @Json(name = "retryCounter")
    private String retryCounter;
    @Json(name = "createdDate")
    private String createdDate;
    @Json(name = "salesStartDate")
    private String salesStartDate;
    @Json(name = "homePageUrlAdr")
    private String homePageUrlAdr;
    @Json(name = "organization")
    private Organization organization;
    @Json(name = "assetName")
    private String assetName;

    public List<AssetTopic> getAssetTopics() {
        return assetTopics;
    }

    public void setAssetTopics(List<AssetTopic> assetTopics) {
        this.assetTopics = assetTopics;
    }

    public String getSalesEndDate() {
        return salesEndDate;
    }

    public void setSalesEndDate(String salesEndDate) {
        this.salesEndDate = salesEndDate;
    }

    public String getRegistrationUrlAdr() {
        return registrationUrlAdr;
    }

    public void setRegistrationUrlAdr(String registrationUrlAdr) {
        this.registrationUrlAdr = registrationUrlAdr;
    }

    public String getRetryDate() {
        return retryDate;
    }

    public void setRetryDate(String retryDate) {
        this.retryDate = retryDate;
    }

    public AssetLegacyData getAssetLegacyData() {
        return assetLegacyData;
    }

    public void setAssetLegacyData(AssetLegacyData assetLegacyData) {
        this.assetLegacyData = assetLegacyData;
    }

    public String getActivityEndDate() {
        return activityEndDate;
    }

    public void setActivityEndDate(String activityEndDate) {
        this.activityEndDate = activityEndDate;
    }

    public String getAssetServiceHostName() {
        return assetServiceHostName;
    }

    public void setAssetServiceHostName(String assetServiceHostName) {
        this.assetServiceHostName = assetServiceHostName;
    }

    public String getActivityStartDate() {
        return activityStartDate;
    }

    public void setActivityStartDate(String activityStartDate) {
        this.activityStartDate = activityStartDate;
    }

    public String getLocalTimeZoneId() {
        return localTimeZoneId;
    }

    public void setLocalTimeZoneId(String localTimeZoneId) {
        this.localTimeZoneId = localTimeZoneId;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String currencyCd) {
        this.currencyCd = currencyCd;
    }

    public SourceSystem getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(SourceSystem sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getUrlAdr() {
        return urlAdr;
    }

    public void setUrlAdr(String urlAdr) {
        this.urlAdr = urlAdr;
    }

    public String getRetryCounter() {
        return retryCounter;
    }

    public void setRetryCounter(String retryCounter) {
        this.retryCounter = retryCounter;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getSalesStartDate() {
        return salesStartDate;
    }

    public void setSalesStartDate(String salesStartDate) {
        this.salesStartDate = salesStartDate;
    }

    public String getHomePageUrlAdr() {
        return homePageUrlAdr;
    }

    public void setHomePageUrlAdr(String homePageUrlAdr) {
        this.homePageUrlAdr = homePageUrlAdr;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

}
