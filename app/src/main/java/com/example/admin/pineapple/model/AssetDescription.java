
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class AssetDescription {

    @Json(name = "descriptionType")
    private DescriptionType descriptionType;
    @Json(name = "description")
    private String description;

    public DescriptionType getDescriptionType() {
        return descriptionType;
    }

    public void setDescriptionType(DescriptionType descriptionType) {
        this.descriptionType = descriptionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
