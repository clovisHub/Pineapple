
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class AssetMetaInterest {

    @Json(name = "sequence")
    private Integer sequence;
    @Json(name = "metaInterest")
    private MetaInterest metaInterest;

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public MetaInterest getMetaInterest() {
        return metaInterest;
    }

    public void setMetaInterest(MetaInterest metaInterest) {
        this.metaInterest = metaInterest;
    }

}
