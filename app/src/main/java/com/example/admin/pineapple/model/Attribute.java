
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class Attribute {

    @Json(name = "tagId")
    private Integer tagId;
    @Json(name = "attributeValue")
    private String attributeValue;
    @Json(name = "attributeType")
    private String attributeType;

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    public String getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

}
