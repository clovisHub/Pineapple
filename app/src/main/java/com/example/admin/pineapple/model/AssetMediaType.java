
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class AssetMediaType {

    @Json(name = "sequence")
    private Integer sequence;
    @Json(name = "mediaType")
    private MediaType mediaType;

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

}
