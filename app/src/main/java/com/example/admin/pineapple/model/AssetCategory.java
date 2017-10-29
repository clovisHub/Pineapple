
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class AssetCategory {

    @Json(name = "sequence")
    private Integer sequence;
    @Json(name = "category")
    private Category category;

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
