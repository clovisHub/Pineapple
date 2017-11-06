
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class AssetLegacyData {

    @Json(name = "participationCriteriaTxt")
    private String participationCriteriaTxt;
    @Json(name = "substitutionUrl")
    private String substitutionUrl;
    @Json(name = "createdDate")
    private String createdDate;
    @Json(name = "modifiedDate")
    private String modifiedDate;

    public String getParticipationCriteriaTxt() {
        return participationCriteriaTxt;
    }

    public void setParticipationCriteriaTxt(String participationCriteriaTxt) {
        this.participationCriteriaTxt = participationCriteriaTxt;
    }

    public String getSubstitutionUrl() {
        return substitutionUrl;
    }

    public void setSubstitutionUrl(String substitutionUrl) {
        this.substitutionUrl = substitutionUrl;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}
