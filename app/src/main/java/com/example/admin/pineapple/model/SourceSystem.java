
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class SourceSystem {

    @Json(name = "sourceSystemName")
    private String sourceSystemName;
    @Json(name = "legacyGuid")
    private String legacyGuid;
    @Json(name = "affiliate")
    private Boolean affiliate;

    public String getSourceSystemName() {
        return sourceSystemName;
    }

    public void setSourceSystemName(String sourceSystemName) {
        this.sourceSystemName = sourceSystemName;
    }

    public String getLegacyGuid() {
        return legacyGuid;
    }

    public void setLegacyGuid(String legacyGuid) {
        this.legacyGuid = legacyGuid;
    }

    public Boolean getAffiliate() {
        return affiliate;
    }

    public void setAffiliate(Boolean affiliate) {
        this.affiliate = affiliate;
    }

}
