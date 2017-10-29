
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class Category {

    @Json(name = "categoryName")
    private String categoryName;
    @Json(name = "categoryId")
    private Integer categoryId;
    @Json(name = "categoryTaxonomy")
    private String categoryTaxonomy;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryTaxonomy() {
        return categoryTaxonomy;
    }

    public void setCategoryTaxonomy(String categoryTaxonomy) {
        this.categoryTaxonomy = categoryTaxonomy;
    }

}
