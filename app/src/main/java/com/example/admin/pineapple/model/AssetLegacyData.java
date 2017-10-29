
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class AssetLegacyData {

    @Json(name = "maxTeamNb")
    private String maxTeamNb;
    @Json(name = "assetTypeId")
    private String assetTypeId;
    @Json(name = "costAmt")
    private Object costAmt;
    @Json(name = "typeName")
    private String typeName;
    @Json(name = "uploadSearchUrlAdr")
    private String uploadSearchUrlAdr;
    @Json(name = "avgUserRatingTxt")
    private String avgUserRatingTxt;
    @Json(name = "trackbackUrl")
    private String trackbackUrl;
    @Json(name = "seoUrl")
    private String seoUrl;
    @Json(name = "eventCategories")
    private String eventCategories;
    @Json(name = "estParticipantNb")
    private String estParticipantNb;
    @Json(name = "participationCriteriaTxt")
    private String participationCriteriaTxt;
    @Json(name = "priceExtensionTxt")
    private String priceExtensionTxt;
    @Json(name = "isSearchable")
    private Boolean isSearchable;
    @Json(name = "onlineMembership")
    private Object onlineMembership;
    @Json(name = "minGuaranteedGameNb")
    private String minGuaranteedGameNb;
    @Json(name = "searchWeight")
    private String searchWeight;
    @Json(name = "userCommentTxt")
    private String userCommentTxt;
    @Json(name = "substitutionUrl")
    private String substitutionUrl;
    @Json(name = "onlineDonation")
    private Object onlineDonation;
    @Json(name = "genderRequirementTxt")
    private String genderRequirementTxt;
    @Json(name = "createdDate")
    private String createdDate;
    @Json(name = "onlineMembershipCostAmt")
    private Object onlineMembershipCostAmt;
    @Json(name = "authorName")
    private String authorName;
    @Json(name = "onlineRegistration")
    private Boolean onlineRegistration;
    @Json(name = "modifiedDate")
    private String modifiedDate;
    @Json(name = "multipleStartDate")
    private Object multipleStartDate;

    public String getMaxTeamNb() {
        return maxTeamNb;
    }

    public void setMaxTeamNb(String maxTeamNb) {
        this.maxTeamNb = maxTeamNb;
    }

    public String getAssetTypeId() {
        return assetTypeId;
    }

    public void setAssetTypeId(String assetTypeId) {
        this.assetTypeId = assetTypeId;
    }

    public Object getCostAmt() {
        return costAmt;
    }

    public void setCostAmt(Object costAmt) {
        this.costAmt = costAmt;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getUploadSearchUrlAdr() {
        return uploadSearchUrlAdr;
    }

    public void setUploadSearchUrlAdr(String uploadSearchUrlAdr) {
        this.uploadSearchUrlAdr = uploadSearchUrlAdr;
    }

    public String getAvgUserRatingTxt() {
        return avgUserRatingTxt;
    }

    public void setAvgUserRatingTxt(String avgUserRatingTxt) {
        this.avgUserRatingTxt = avgUserRatingTxt;
    }

    public String getTrackbackUrl() {
        return trackbackUrl;
    }

    public void setTrackbackUrl(String trackbackUrl) {
        this.trackbackUrl = trackbackUrl;
    }

    public String getSeoUrl() {
        return seoUrl;
    }

    public void setSeoUrl(String seoUrl) {
        this.seoUrl = seoUrl;
    }

    public String getEventCategories() {
        return eventCategories;
    }

    public void setEventCategories(String eventCategories) {
        this.eventCategories = eventCategories;
    }

    public String getEstParticipantNb() {
        return estParticipantNb;
    }

    public void setEstParticipantNb(String estParticipantNb) {
        this.estParticipantNb = estParticipantNb;
    }

    public String getParticipationCriteriaTxt() {
        return participationCriteriaTxt;
    }

    public void setParticipationCriteriaTxt(String participationCriteriaTxt) {
        this.participationCriteriaTxt = participationCriteriaTxt;
    }

    public String getPriceExtensionTxt() {
        return priceExtensionTxt;
    }

    public void setPriceExtensionTxt(String priceExtensionTxt) {
        this.priceExtensionTxt = priceExtensionTxt;
    }

    public Boolean getIsSearchable() {
        return isSearchable;
    }

    public void setIsSearchable(Boolean isSearchable) {
        this.isSearchable = isSearchable;
    }

    public Object getOnlineMembership() {
        return onlineMembership;
    }

    public void setOnlineMembership(Object onlineMembership) {
        this.onlineMembership = onlineMembership;
    }

    public String getMinGuaranteedGameNb() {
        return minGuaranteedGameNb;
    }

    public void setMinGuaranteedGameNb(String minGuaranteedGameNb) {
        this.minGuaranteedGameNb = minGuaranteedGameNb;
    }

    public String getSearchWeight() {
        return searchWeight;
    }

    public void setSearchWeight(String searchWeight) {
        this.searchWeight = searchWeight;
    }

    public String getUserCommentTxt() {
        return userCommentTxt;
    }

    public void setUserCommentTxt(String userCommentTxt) {
        this.userCommentTxt = userCommentTxt;
    }

    public String getSubstitutionUrl() {
        return substitutionUrl;
    }

    public void setSubstitutionUrl(String substitutionUrl) {
        this.substitutionUrl = substitutionUrl;
    }

    public Object getOnlineDonation() {
        return onlineDonation;
    }

    public void setOnlineDonation(Object onlineDonation) {
        this.onlineDonation = onlineDonation;
    }

    public String getGenderRequirementTxt() {
        return genderRequirementTxt;
    }

    public void setGenderRequirementTxt(String genderRequirementTxt) {
        this.genderRequirementTxt = genderRequirementTxt;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Object getOnlineMembershipCostAmt() {
        return onlineMembershipCostAmt;
    }

    public void setOnlineMembershipCostAmt(Object onlineMembershipCostAmt) {
        this.onlineMembershipCostAmt = onlineMembershipCostAmt;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Boolean getOnlineRegistration() {
        return onlineRegistration;
    }

    public void setOnlineRegistration(Boolean onlineRegistration) {
        this.onlineRegistration = onlineRegistration;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Object getMultipleStartDate() {
        return multipleStartDate;
    }

    public void setMultipleStartDate(Object multipleStartDate) {
        this.multipleStartDate = multipleStartDate;
    }

}
