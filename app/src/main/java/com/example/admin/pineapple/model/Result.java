
package com.example.admin.pineapple.model;

import java.util.List;
import com.squareup.moshi.Json;

public class Result {

    @Json(name = "assetTopics")
    private List<AssetTopic> assetTopics = null;
    @Json(name = "salesEndDate")
    private Object salesEndDate;
    @Json(name = "regReqGenderCd")
    private String regReqGenderCd;
    @Json(name = "registrationUrlAdr")
    private String registrationUrlAdr;
    @Json(name = "retryDate")
    private Object retryDate;
    @Json(name = "evergreenAssets")
    private List<Object> evergreenAssets = null;
    @Json(name = "assetSeoUrls")
    private List<AssetSeoUrl> assetSeoUrls = null;
    @Json(name = "publishDate")
    private Object publishDate;
    @Json(name = "assetChannels")
    private List<AssetChannel> assetChannels = null;
    @Json(name = "sorCreateDtm")
    private Object sorCreateDtm;
    @Json(name = "sponsoredContent")
    private SponsoredContent sponsoredContent;
    @Json(name = "dynamicPriceIncluded")
    private Boolean dynamicPriceIncluded;
    @Json(name = "localeCd")
    private String localeCd;
    @Json(name = "activityRecurrences")
    private List<ActivityRecurrence> activityRecurrences = null;
    @Json(name = "assetLegacyData")
    private AssetLegacyData assetLegacyData;
    @Json(name = "activityEndDate")
    private String activityEndDate;
    @Json(name = "assetDeals")
    private List<Object> assetDeals = null;
    @Json(name = "assetServiceHostName")
    private String assetServiceHostName;
    @Json(name = "childIndex")
    private Object childIndex;
    @Json(name = "assetDescriptions")
    private List<AssetDescription> assetDescriptions = null;
    @Json(name = "componentInUrlAdr")
    private ComponentInUrlAdr componentInUrlAdr;
    @Json(name = "activityStartDate")
    private String activityStartDate;
    @Json(name = "volumePriceIncluded")
    private Boolean volumePriceIncluded;
    @Json(name = "contactName")
    private String contactName;
    @Json(name = "sorCreateUserId")
    private String sorCreateUserId;
    @Json(name = "localTimeZoneId")
    private String localTimeZoneId;
    @Json(name = "socialMedia")
    private List<Object> socialMedia = null;
    @Json(name = "donationUrlAdr")
    private String donationUrlAdr;
    @Json(name = "activenetTopGraphic")
    private ActivenetTopGraphic activenetTopGraphic;
    @Json(name = "assetReferences")
    private List<Object> assetReferences = null;
    @Json(name = "market")
    private Market market;
    @Json(name = "assetAttributes")
    private List<AssetAttribute> assetAttributes = null;
    @Json(name = "timezoneAbb")
    private String timezoneAbb;
    @Json(name = "assetMediaTypes")
    private List<AssetMediaType> assetMediaTypes = null;
    @Json(name = "evergreenAssetFlag")
    private String evergreenAssetFlag;
    @Json(name = "authorName")
    private String authorName;
    @Json(name = "registrantSearchUrlAdr")
    private String registrantSearchUrlAdr;
    @Json(name = "modifiedDate")
    private String modifiedDate;
    @Json(name = "timezoneName")
    private String timezoneName;
    @Json(name = "showContact")
    private String showContact;
    @Json(name = "assetParentAsset")
    private AssetParentAsset assetParentAsset;
    @Json(name = "assetStatus")
    private AssetStatus assetStatus;
    @Json(name = "regReqMaxAge")
    private Object regReqMaxAge;
    @Json(name = "currencyCd")
    private String currencyCd;
    @Json(name = "resultsUrlAdr")
    private String resultsUrlAdr;
    @Json(name = "assetImages")
    private List<Object> assetImages = null;
    @Json(name = "assetRegistrableStatus")
    private String assetRegistrableStatus;
    @Json(name = "sourceSystem")
    private SourceSystem sourceSystem;
    @Json(name = "assetGuid")
    private String assetGuid;
    @Json(name = "timezone")
    private String timezone;
    @Json(name = "evergreenParentAsset")
    private EvergreenParentAsset evergreenParentAsset;
    @Json(name = "assetTags")
    private List<AssetTag> assetTags = null;
    @Json(name = "assetRootAsset")
    private AssetRootAsset assetRootAsset;
    @Json(name = "assetPopularity")
    private AssetPopularity assetPopularity;
    @Json(name = "preferredUrlAdr")
    private String preferredUrlAdr;
    @Json(name = "logoUrlAdr")
    private String logoUrlAdr;
    @Json(name = "assetPrices")
    private List<Object> assetPrices = null;
    @Json(name = "detailPageTemplateId")
    private String detailPageTemplateId;
    @Json(name = "assetComponents")
    private List<AssetComponent> assetComponents = null;
    @Json(name = "teamUrlAdr")
    private String teamUrlAdr;
    @Json(name = "sorId")
    private String sorId;
    @Json(name = "place")
    private Place place;
    @Json(name = "overrideSeourlFlag")
    private Boolean overrideSeourlFlag;
    @Json(name = "assetCategories")
    private List<AssetCategory> assetCategories = null;
    @Json(name = "urlAdr")
    private String urlAdr;
    @Json(name = "retryCounter")
    private Integer retryCounter;
    @Json(name = "assetInterests")
    private List<Object> assetInterests = null;
    @Json(name = "assetDsc")
    private String assetDsc;
    @Json(name = "contactTxt")
    private String contactTxt;
    @Json(name = "alternateName")
    private String alternateName;
    @Json(name = "regReqMinAge")
    private Object regReqMinAge;
    @Json(name = "createdDate")
    private String createdDate;
    @Json(name = "assetMetaInterests")
    private List<AssetMetaInterest> assetMetaInterests = null;
    @Json(name = "salesStartDate")
    private Object salesStartDate;
    @Json(name = "homePageUrlAdr")
    private String homePageUrlAdr;
    @Json(name = "assetQuantity")
    private AssetQuantity assetQuantity;
    @Json(name = "organization")
    private Organization organization;
    @Json(name = "assetName")
    private String assetName;
    @Json(name = "contactPhone")
    private String contactPhone;
    @Json(name = "searchScore")
    private Object searchScore;
    @Json(name = "assetVersion")
    private Integer assetVersion;
    @Json(name = "salesStatus")
    private String salesStatus;

    public List<AssetTopic> getAssetTopics() {
        return assetTopics;
    }

    public void setAssetTopics(List<AssetTopic> assetTopics) {
        this.assetTopics = assetTopics;
    }

    public Object getSalesEndDate() {
        return salesEndDate;
    }

    public void setSalesEndDate(Object salesEndDate) {
        this.salesEndDate = salesEndDate;
    }

    public String getRegReqGenderCd() {
        return regReqGenderCd;
    }

    public void setRegReqGenderCd(String regReqGenderCd) {
        this.regReqGenderCd = regReqGenderCd;
    }

    public String getRegistrationUrlAdr() {
        return registrationUrlAdr;
    }

    public void setRegistrationUrlAdr(String registrationUrlAdr) {
        this.registrationUrlAdr = registrationUrlAdr;
    }

    public Object getRetryDate() {
        return retryDate;
    }

    public void setRetryDate(Object retryDate) {
        this.retryDate = retryDate;
    }

    public List<Object> getEvergreenAssets() {
        return evergreenAssets;
    }

    public void setEvergreenAssets(List<Object> evergreenAssets) {
        this.evergreenAssets = evergreenAssets;
    }

    public List<AssetSeoUrl> getAssetSeoUrls() {
        return assetSeoUrls;
    }

    public void setAssetSeoUrls(List<AssetSeoUrl> assetSeoUrls) {
        this.assetSeoUrls = assetSeoUrls;
    }

    public Object getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Object publishDate) {
        this.publishDate = publishDate;
    }

    public List<AssetChannel> getAssetChannels() {
        return assetChannels;
    }

    public void setAssetChannels(List<AssetChannel> assetChannels) {
        this.assetChannels = assetChannels;
    }

    public Object getSorCreateDtm() {
        return sorCreateDtm;
    }

    public void setSorCreateDtm(Object sorCreateDtm) {
        this.sorCreateDtm = sorCreateDtm;
    }

    public SponsoredContent getSponsoredContent() {
        return sponsoredContent;
    }

    public void setSponsoredContent(SponsoredContent sponsoredContent) {
        this.sponsoredContent = sponsoredContent;
    }

    public Boolean getDynamicPriceIncluded() {
        return dynamicPriceIncluded;
    }

    public void setDynamicPriceIncluded(Boolean dynamicPriceIncluded) {
        this.dynamicPriceIncluded = dynamicPriceIncluded;
    }

    public String getLocaleCd() {
        return localeCd;
    }

    public void setLocaleCd(String localeCd) {
        this.localeCd = localeCd;
    }

    public List<ActivityRecurrence> getActivityRecurrences() {
        return activityRecurrences;
    }

    public void setActivityRecurrences(List<ActivityRecurrence> activityRecurrences) {
        this.activityRecurrences = activityRecurrences;
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

    public List<Object> getAssetDeals() {
        return assetDeals;
    }

    public void setAssetDeals(List<Object> assetDeals) {
        this.assetDeals = assetDeals;
    }

    public String getAssetServiceHostName() {
        return assetServiceHostName;
    }

    public void setAssetServiceHostName(String assetServiceHostName) {
        this.assetServiceHostName = assetServiceHostName;
    }

    public Object getChildIndex() {
        return childIndex;
    }

    public void setChildIndex(Object childIndex) {
        this.childIndex = childIndex;
    }

    public List<AssetDescription> getAssetDescriptions() {
        return assetDescriptions;
    }

    public void setAssetDescriptions(List<AssetDescription> assetDescriptions) {
        this.assetDescriptions = assetDescriptions;
    }

    public ComponentInUrlAdr getComponentInUrlAdr() {
        return componentInUrlAdr;
    }

    public void setComponentInUrlAdr(ComponentInUrlAdr componentInUrlAdr) {
        this.componentInUrlAdr = componentInUrlAdr;
    }

    public String getActivityStartDate() {
        return activityStartDate;
    }

    public void setActivityStartDate(String activityStartDate) {
        this.activityStartDate = activityStartDate;
    }

    public Boolean getVolumePriceIncluded() {
        return volumePriceIncluded;
    }

    public void setVolumePriceIncluded(Boolean volumePriceIncluded) {
        this.volumePriceIncluded = volumePriceIncluded;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getSorCreateUserId() {
        return sorCreateUserId;
    }

    public void setSorCreateUserId(String sorCreateUserId) {
        this.sorCreateUserId = sorCreateUserId;
    }

    public String getLocalTimeZoneId() {
        return localTimeZoneId;
    }

    public void setLocalTimeZoneId(String localTimeZoneId) {
        this.localTimeZoneId = localTimeZoneId;
    }

    public List<Object> getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(List<Object> socialMedia) {
        this.socialMedia = socialMedia;
    }

    public String getDonationUrlAdr() {
        return donationUrlAdr;
    }

    public void setDonationUrlAdr(String donationUrlAdr) {
        this.donationUrlAdr = donationUrlAdr;
    }

    public ActivenetTopGraphic getActivenetTopGraphic() {
        return activenetTopGraphic;
    }

    public void setActivenetTopGraphic(ActivenetTopGraphic activenetTopGraphic) {
        this.activenetTopGraphic = activenetTopGraphic;
    }

    public List<Object> getAssetReferences() {
        return assetReferences;
    }

    public void setAssetReferences(List<Object> assetReferences) {
        this.assetReferences = assetReferences;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public List<AssetAttribute> getAssetAttributes() {
        return assetAttributes;
    }

    public void setAssetAttributes(List<AssetAttribute> assetAttributes) {
        this.assetAttributes = assetAttributes;
    }

    public String getTimezoneAbb() {
        return timezoneAbb;
    }

    public void setTimezoneAbb(String timezoneAbb) {
        this.timezoneAbb = timezoneAbb;
    }

    public List<AssetMediaType> getAssetMediaTypes() {
        return assetMediaTypes;
    }

    public void setAssetMediaTypes(List<AssetMediaType> assetMediaTypes) {
        this.assetMediaTypes = assetMediaTypes;
    }

    public String getEvergreenAssetFlag() {
        return evergreenAssetFlag;
    }

    public void setEvergreenAssetFlag(String evergreenAssetFlag) {
        this.evergreenAssetFlag = evergreenAssetFlag;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getRegistrantSearchUrlAdr() {
        return registrantSearchUrlAdr;
    }

    public void setRegistrantSearchUrlAdr(String registrantSearchUrlAdr) {
        this.registrantSearchUrlAdr = registrantSearchUrlAdr;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getTimezoneName() {
        return timezoneName;
    }

    public void setTimezoneName(String timezoneName) {
        this.timezoneName = timezoneName;
    }

    public String getShowContact() {
        return showContact;
    }

    public void setShowContact(String showContact) {
        this.showContact = showContact;
    }

    public AssetParentAsset getAssetParentAsset() {
        return assetParentAsset;
    }

    public void setAssetParentAsset(AssetParentAsset assetParentAsset) {
        this.assetParentAsset = assetParentAsset;
    }

    public AssetStatus getAssetStatus() {
        return assetStatus;
    }

    public void setAssetStatus(AssetStatus assetStatus) {
        this.assetStatus = assetStatus;
    }

    public Object getRegReqMaxAge() {
        return regReqMaxAge;
    }

    public void setRegReqMaxAge(Object regReqMaxAge) {
        this.regReqMaxAge = regReqMaxAge;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String currencyCd) {
        this.currencyCd = currencyCd;
    }

    public String getResultsUrlAdr() {
        return resultsUrlAdr;
    }

    public void setResultsUrlAdr(String resultsUrlAdr) {
        this.resultsUrlAdr = resultsUrlAdr;
    }

    public List<Object> getAssetImages() {
        return assetImages;
    }

    public void setAssetImages(List<Object> assetImages) {
        this.assetImages = assetImages;
    }

    public String getAssetRegistrableStatus() {
        return assetRegistrableStatus;
    }

    public void setAssetRegistrableStatus(String assetRegistrableStatus) {
        this.assetRegistrableStatus = assetRegistrableStatus;
    }

    public SourceSystem getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(SourceSystem sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public String getAssetGuid() {
        return assetGuid;
    }

    public void setAssetGuid(String assetGuid) {
        this.assetGuid = assetGuid;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public EvergreenParentAsset getEvergreenParentAsset() {
        return evergreenParentAsset;
    }

    public void setEvergreenParentAsset(EvergreenParentAsset evergreenParentAsset) {
        this.evergreenParentAsset = evergreenParentAsset;
    }

    public List<AssetTag> getAssetTags() {
        return assetTags;
    }

    public void setAssetTags(List<AssetTag> assetTags) {
        this.assetTags = assetTags;
    }

    public AssetRootAsset getAssetRootAsset() {
        return assetRootAsset;
    }

    public void setAssetRootAsset(AssetRootAsset assetRootAsset) {
        this.assetRootAsset = assetRootAsset;
    }

    public AssetPopularity getAssetPopularity() {
        return assetPopularity;
    }

    public void setAssetPopularity(AssetPopularity assetPopularity) {
        this.assetPopularity = assetPopularity;
    }

    public String getPreferredUrlAdr() {
        return preferredUrlAdr;
    }

    public void setPreferredUrlAdr(String preferredUrlAdr) {
        this.preferredUrlAdr = preferredUrlAdr;
    }

    public String getLogoUrlAdr() {
        return logoUrlAdr;
    }

    public void setLogoUrlAdr(String logoUrlAdr) {
        this.logoUrlAdr = logoUrlAdr;
    }

    public List<Object> getAssetPrices() {
        return assetPrices;
    }

    public void setAssetPrices(List<Object> assetPrices) {
        this.assetPrices = assetPrices;
    }

    public String getDetailPageTemplateId() {
        return detailPageTemplateId;
    }

    public void setDetailPageTemplateId(String detailPageTemplateId) {
        this.detailPageTemplateId = detailPageTemplateId;
    }

    public List<AssetComponent> getAssetComponents() {
        return assetComponents;
    }

    public void setAssetComponents(List<AssetComponent> assetComponents) {
        this.assetComponents = assetComponents;
    }

    public String getTeamUrlAdr() {
        return teamUrlAdr;
    }

    public void setTeamUrlAdr(String teamUrlAdr) {
        this.teamUrlAdr = teamUrlAdr;
    }

    public String getSorId() {
        return sorId;
    }

    public void setSorId(String sorId) {
        this.sorId = sorId;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Boolean getOverrideSeourlFlag() {
        return overrideSeourlFlag;
    }

    public void setOverrideSeourlFlag(Boolean overrideSeourlFlag) {
        this.overrideSeourlFlag = overrideSeourlFlag;
    }

    public List<AssetCategory> getAssetCategories() {
        return assetCategories;
    }

    public void setAssetCategories(List<AssetCategory> assetCategories) {
        this.assetCategories = assetCategories;
    }

    public String getUrlAdr() {
        return urlAdr;
    }

    public void setUrlAdr(String urlAdr) {
        this.urlAdr = urlAdr;
    }

    public Integer getRetryCounter() {
        return retryCounter;
    }

    public void setRetryCounter(Integer retryCounter) {
        this.retryCounter = retryCounter;
    }

    public List<Object> getAssetInterests() {
        return assetInterests;
    }

    public void setAssetInterests(List<Object> assetInterests) {
        this.assetInterests = assetInterests;
    }

    public String getAssetDsc() {
        return assetDsc;
    }

    public void setAssetDsc(String assetDsc) {
        this.assetDsc = assetDsc;
    }

    public String getContactTxt() {
        return contactTxt;
    }

    public void setContactTxt(String contactTxt) {
        this.contactTxt = contactTxt;
    }

    public String getAlternateName() {
        return alternateName;
    }

    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public Object getRegReqMinAge() {
        return regReqMinAge;
    }

    public void setRegReqMinAge(Object regReqMinAge) {
        this.regReqMinAge = regReqMinAge;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public List<AssetMetaInterest> getAssetMetaInterests() {
        return assetMetaInterests;
    }

    public void setAssetMetaInterests(List<AssetMetaInterest> assetMetaInterests) {
        this.assetMetaInterests = assetMetaInterests;
    }

    public Object getSalesStartDate() {
        return salesStartDate;
    }

    public void setSalesStartDate(Object salesStartDate) {
        this.salesStartDate = salesStartDate;
    }

    public String getHomePageUrlAdr() {
        return homePageUrlAdr;
    }

    public void setHomePageUrlAdr(String homePageUrlAdr) {
        this.homePageUrlAdr = homePageUrlAdr;
    }

    public AssetQuantity getAssetQuantity() {
        return assetQuantity;
    }

    public void setAssetQuantity(AssetQuantity assetQuantity) {
        this.assetQuantity = assetQuantity;
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

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Object getSearchScore() {
        return searchScore;
    }

    public void setSearchScore(Object searchScore) {
        this.searchScore = searchScore;
    }

    public Integer getAssetVersion() {
        return assetVersion;
    }

    public void setAssetVersion(Integer assetVersion) {
        this.assetVersion = assetVersion;
    }

    public String getSalesStatus() {
        return salesStatus;
    }

    public void setSalesStatus(String salesStatus) {
        this.salesStatus = salesStatus;
    }

    @Override
    public String toString() {
        return "Result{" +
                "assetTopics=" + assetTopics +
                ", salesEndDate=" + salesEndDate +
                ", regReqGenderCd='" + regReqGenderCd + '\'' +
                ", registrationUrlAdr='" + registrationUrlAdr + '\'' +
                ", retryDate=" + retryDate +
                ", evergreenAssets=" + evergreenAssets +
                ", assetSeoUrls=" + assetSeoUrls +
                ", publishDate=" + publishDate +
                ", assetChannels=" + assetChannels +
                ", sorCreateDtm=" + sorCreateDtm +
                ", sponsoredContent=" + sponsoredContent +
                ", dynamicPriceIncluded=" + dynamicPriceIncluded +
                ", localeCd='" + localeCd + '\'' +
                ", activityRecurrences=" + activityRecurrences +
                ", assetLegacyData=" + assetLegacyData +
                ", activityEndDate='" + activityEndDate + '\'' +
                ", assetDeals=" + assetDeals +
                ", assetServiceHostName='" + assetServiceHostName + '\'' +
                ", childIndex=" + childIndex +
                ", assetDescriptions=" + assetDescriptions +
                ", componentInUrlAdr=" + componentInUrlAdr +
                ", activityStartDate='" + activityStartDate + '\'' +
                ", volumePriceIncluded=" + volumePriceIncluded +
                ", contactName='" + contactName + '\'' +
                ", sorCreateUserId='" + sorCreateUserId + '\'' +
                ", localTimeZoneId='" + localTimeZoneId + '\'' +
                ", socialMedia=" + socialMedia +
                ", donationUrlAdr='" + donationUrlAdr + '\'' +
                ", activenetTopGraphic=" + activenetTopGraphic +
                ", assetReferences=" + assetReferences +
                ", market=" + market +
                ", assetAttributes=" + assetAttributes +
                ", timezoneAbb='" + timezoneAbb + '\'' +
                ", assetMediaTypes=" + assetMediaTypes +
                ", evergreenAssetFlag='" + evergreenAssetFlag + '\'' +
                ", authorName='" + authorName + '\'' +
                ", registrantSearchUrlAdr='" + registrantSearchUrlAdr + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                ", timezoneName='" + timezoneName + '\'' +
                ", showContact='" + showContact + '\'' +
                ", assetParentAsset=" + assetParentAsset +
                ", assetStatus=" + assetStatus +
                ", regReqMaxAge=" + regReqMaxAge +
                ", currencyCd='" + currencyCd + '\'' +
                ", resultsUrlAdr='" + resultsUrlAdr + '\'' +
                ", assetImages=" + assetImages +
                ", assetRegistrableStatus='" + assetRegistrableStatus + '\'' +
                ", sourceSystem=" + sourceSystem +
                ", assetGuid='" + assetGuid + '\'' +
                ", timezone='" + timezone + '\'' +
                ", evergreenParentAsset=" + evergreenParentAsset +
                ", assetTags=" + assetTags +
                ", assetRootAsset=" + assetRootAsset +
                ", assetPopularity=" + assetPopularity +
                ", preferredUrlAdr='" + preferredUrlAdr + '\'' +
                ", logoUrlAdr='" + logoUrlAdr + '\'' +
                ", assetPrices=" + assetPrices +
                ", detailPageTemplateId='" + detailPageTemplateId + '\'' +
                ", assetComponents=" + assetComponents +
                ", teamUrlAdr='" + teamUrlAdr + '\'' +
                ", sorId='" + sorId + '\'' +
                ", place=" + place +
                ", overrideSeourlFlag=" + overrideSeourlFlag +
                ", assetCategories=" + assetCategories +
                ", urlAdr='" + urlAdr + '\'' +
                ", retryCounter=" + retryCounter +
                ", assetInterests=" + assetInterests +
                ", assetDsc='" + assetDsc + '\'' +
                ", contactTxt='" + contactTxt + '\'' +
                ", alternateName='" + alternateName + '\'' +
                ", regReqMinAge=" + regReqMinAge +
                ", createdDate='" + createdDate + '\'' +
                ", assetMetaInterests=" + assetMetaInterests +
                ", salesStartDate=" + salesStartDate +
                ", homePageUrlAdr='" + homePageUrlAdr + '\'' +
                ", assetQuantity=" + assetQuantity +
                ", organization=" + organization +
                ", assetName='" + assetName + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", searchScore=" + searchScore +
                ", assetVersion=" + assetVersion +
                ", salesStatus='" + salesStatus + '\'' +
                '}';
    }
}
