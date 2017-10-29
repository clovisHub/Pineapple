
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class Tag {

    @Json(name = "tagId")
    private Integer tagId;
    @Json(name = "tagName")
    private String tagName;
    @Json(name = "tagDescription")
    private String tagDescription;

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagDescription() {
        return tagDescription;
    }

    public void setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription;
    }

}
