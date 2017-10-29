
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class AssetAttribute {

    @Json(name = "attribute")
    private Attribute attribute;

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

}
