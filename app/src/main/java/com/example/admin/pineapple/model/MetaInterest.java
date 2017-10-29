
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class MetaInterest {

    @Json(name = "metaInterestId")
    private Integer metaInterestId;
    @Json(name = "metaInterestTaxonomy")
    private String metaInterestTaxonomy;
    @Json(name = "metaInterestName")
    private String metaInterestName;

    public Integer getMetaInterestId() {
        return metaInterestId;
    }

    public void setMetaInterestId(Integer metaInterestId) {
        this.metaInterestId = metaInterestId;
    }

    public String getMetaInterestTaxonomy() {
        return metaInterestTaxonomy;
    }

    public void setMetaInterestTaxonomy(String metaInterestTaxonomy) {
        this.metaInterestTaxonomy = metaInterestTaxonomy;
    }

    public String getMetaInterestName() {
        return metaInterestName;
    }

    public void setMetaInterestName(String metaInterestName) {
        this.metaInterestName = metaInterestName;
    }

}
