
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class DescriptionType {

    @Json(name = "descriptionTypeName")
    private String descriptionTypeName;
    @Json(name = "descriptionTypeId")
    private Integer descriptionTypeId;

    public String getDescriptionTypeName() {
        return descriptionTypeName;
    }

    public void setDescriptionTypeName(String descriptionTypeName) {
        this.descriptionTypeName = descriptionTypeName;
    }

    public Integer getDescriptionTypeId() {
        return descriptionTypeId;
    }

    public void setDescriptionTypeId(Integer descriptionTypeId) {
        this.descriptionTypeId = descriptionTypeId;
    }

}
