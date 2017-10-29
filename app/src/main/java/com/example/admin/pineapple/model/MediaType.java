
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class MediaType {

    @Json(name = "mediaTypeName")
    private String mediaTypeName;
    @Json(name = "mediaTypeDsc")
    private String mediaTypeDsc;
    @Json(name = "mediaTypeId")
    private Integer mediaTypeId;

    public String getMediaTypeName() {
        return mediaTypeName;
    }

    public void setMediaTypeName(String mediaTypeName) {
        this.mediaTypeName = mediaTypeName;
    }

    public String getMediaTypeDsc() {
        return mediaTypeDsc;
    }

    public void setMediaTypeDsc(String mediaTypeDsc) {
        this.mediaTypeDsc = mediaTypeDsc;
    }

    public Integer getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(Integer mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

}
