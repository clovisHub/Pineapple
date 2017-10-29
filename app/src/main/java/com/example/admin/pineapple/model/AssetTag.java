
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class AssetTag {

    @Json(name = "tag")
    private Tag tag;

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

}
