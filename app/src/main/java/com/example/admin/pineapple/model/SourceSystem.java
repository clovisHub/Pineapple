
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class SourceSystem {

    @Json(name = "sourceSystemName")
    private String sourceSystemName;

    public String getSourceSystemName() {
        return sourceSystemName;
    }

    public void setSourceSystemName(String sourceSystemName) {
        this.sourceSystemName = sourceSystemName;
    }

}
