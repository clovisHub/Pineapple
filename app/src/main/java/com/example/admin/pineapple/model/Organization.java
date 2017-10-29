
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class Organization {

    @Json(name = "primaryContactName")
    private String primaryContactName;
    @Json(name = "organizationName")
    private String organizationName;
    @Json(name = "addressPostalCd")
    private String addressPostalCd;
    @Json(name = "sourceSystemId")
    private Integer sourceSystemId;
    @Json(name = "imageUrlAdr")
    private String imageUrlAdr;
    @Json(name = "addressCityName")
    private String addressCityName;
    @Json(name = "eventCount")
    private Integer eventCount;
    @Json(name = "organizationGuid")
    private String organizationGuid;
    @Json(name = "primaryContactPhone")
    private String primaryContactPhone;
    @Json(name = "addressLine2Txt")
    private String addressLine2Txt;
    @Json(name = "shortDsc")
    private String shortDsc;
    @Json(name = "addressLine1Txt")
    private String addressLine1Txt;
    @Json(name = "addressLocalityName")
    private String addressLocalityName;
    @Json(name = "organizationDsc")
    private String organizationDsc;
    @Json(name = "organizationUrlAdr")
    private String organizationUrlAdr;
    @Json(name = "hideOrganizationContact")
    private Boolean hideOrganizationContact;
    @Json(name = "isDeleted")
    private Boolean isDeleted;
    @Json(name = "a3EventCount")
    private Integer a3EventCount;
    @Json(name = "addressStateProvinceCode")
    private String addressStateProvinceCode;
    @Json(name = "sourceSystemGuid")
    private String sourceSystemGuid;
    @Json(name = "addressCountryCd")
    private String addressCountryCd;
    @Json(name = "showOrganizationName")
    private Boolean showOrganizationName;
    @Json(name = "fax")
    private String fax;

    public String getPrimaryContactName() {
        return primaryContactName;
    }

    public void setPrimaryContactName(String primaryContactName) {
        this.primaryContactName = primaryContactName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getAddressPostalCd() {
        return addressPostalCd;
    }

    public void setAddressPostalCd(String addressPostalCd) {
        this.addressPostalCd = addressPostalCd;
    }

    public Integer getSourceSystemId() {
        return sourceSystemId;
    }

    public void setSourceSystemId(Integer sourceSystemId) {
        this.sourceSystemId = sourceSystemId;
    }

    public String getImageUrlAdr() {
        return imageUrlAdr;
    }

    public void setImageUrlAdr(String imageUrlAdr) {
        this.imageUrlAdr = imageUrlAdr;
    }

    public String getAddressCityName() {
        return addressCityName;
    }

    public void setAddressCityName(String addressCityName) {
        this.addressCityName = addressCityName;
    }

    public Integer getEventCount() {
        return eventCount;
    }

    public void setEventCount(Integer eventCount) {
        this.eventCount = eventCount;
    }

    public String getOrganizationGuid() {
        return organizationGuid;
    }

    public void setOrganizationGuid(String organizationGuid) {
        this.organizationGuid = organizationGuid;
    }

    public String getPrimaryContactPhone() {
        return primaryContactPhone;
    }

    public void setPrimaryContactPhone(String primaryContactPhone) {
        this.primaryContactPhone = primaryContactPhone;
    }

    public String getAddressLine2Txt() {
        return addressLine2Txt;
    }

    public void setAddressLine2Txt(String addressLine2Txt) {
        this.addressLine2Txt = addressLine2Txt;
    }

    public String getShortDsc() {
        return shortDsc;
    }

    public void setShortDsc(String shortDsc) {
        this.shortDsc = shortDsc;
    }

    public String getAddressLine1Txt() {
        return addressLine1Txt;
    }

    public void setAddressLine1Txt(String addressLine1Txt) {
        this.addressLine1Txt = addressLine1Txt;
    }

    public String getAddressLocalityName() {
        return addressLocalityName;
    }

    public void setAddressLocalityName(String addressLocalityName) {
        this.addressLocalityName = addressLocalityName;
    }

    public String getOrganizationDsc() {
        return organizationDsc;
    }

    public void setOrganizationDsc(String organizationDsc) {
        this.organizationDsc = organizationDsc;
    }

    public String getOrganizationUrlAdr() {
        return organizationUrlAdr;
    }

    public void setOrganizationUrlAdr(String organizationUrlAdr) {
        this.organizationUrlAdr = organizationUrlAdr;
    }

    public Boolean getHideOrganizationContact() {
        return hideOrganizationContact;
    }

    public void setHideOrganizationContact(Boolean hideOrganizationContact) {
        this.hideOrganizationContact = hideOrganizationContact;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getA3EventCount() {
        return a3EventCount;
    }

    public void setA3EventCount(Integer a3EventCount) {
        this.a3EventCount = a3EventCount;
    }

    public String getAddressStateProvinceCode() {
        return addressStateProvinceCode;
    }

    public void setAddressStateProvinceCode(String addressStateProvinceCode) {
        this.addressStateProvinceCode = addressStateProvinceCode;
    }

    public String getSourceSystemGuid() {
        return sourceSystemGuid;
    }

    public void setSourceSystemGuid(String sourceSystemGuid) {
        this.sourceSystemGuid = sourceSystemGuid;
    }

    public String getAddressCountryCd() {
        return addressCountryCd;
    }

    public void setAddressCountryCd(String addressCountryCd) {
        this.addressCountryCd = addressCountryCd;
    }

    public Boolean getShowOrganizationName() {
        return showOrganizationName;
    }

    public void setShowOrganizationName(Boolean showOrganizationName) {
        this.showOrganizationName = showOrganizationName;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

}
