
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class AssetPopularity {

    @Json(name = "searches")
    private Integer searches;
    @Json(name = "createdAt")
    private Integer createdAt;
    @Json(name = "clickTypes")
    private ClickTypes clickTypes;
    @Json(name = "clicks")
    private Integer clicks;
    @Json(name = "rank")
    private Integer rank;
    @Json(name = "results")
    private Integer results;
    @Json(name = "views")
    private Integer views;
    @Json(name = "A3Rank")
    private Integer a3Rank;

    public Integer getSearches() {
        return searches;
    }

    public void setSearches(Integer searches) {
        this.searches = searches;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public ClickTypes getClickTypes() {
        return clickTypes;
    }

    public void setClickTypes(ClickTypes clickTypes) {
        this.clickTypes = clickTypes;
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getResults() {
        return results;
    }

    public void setResults(Integer results) {
        this.results = results;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getA3Rank() {
        return a3Rank;
    }

    public void setA3Rank(Integer a3Rank) {
        this.a3Rank = a3Rank;
    }

}
