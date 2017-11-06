
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class Organization {

    @Json(name = "organizationName")
    private String organizationName;
    @Json(name = "addressPostalCd")
    private String addressPostalCd;
    @Json(name = "sourceSystemId")
    private String sourceSystemId;
    @Json(name = "addressCityName")
    private String addressCityName;
    @Json(name = "organizationGuid")
    private String organizationGuid;
    @Json(name = "primaryContactPhone")
    private String primaryContactPhone;
    @Json(name = "addressLine1Txt")
    private String addressLine1Txt;
    @Json(name = "addressStateProvinceCode")
    private String addressStateProvinceCode;
    @Json(name = "sourceSystemGuid")
    private String sourceSystemGuid;
    @Json(name = "addressCountryCd")
    private String addressCountryCd;

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

    public String getSourceSystemId() {
        return sourceSystemId;
    }

    public void setSourceSystemId(String sourceSystemId) {
        this.sourceSystemId = sourceSystemId;
    }

    public String getAddressCityName() {
        return addressCityName;
    }

    public void setAddressCityName(String addressCityName) {
        this.addressCityName = addressCityName;
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

    public String getAddressLine1Txt() {
        return addressLine1Txt;
    }

    public void setAddressLine1Txt(String addressLine1Txt) {
        this.addressLine1Txt = addressLine1Txt;
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

}
