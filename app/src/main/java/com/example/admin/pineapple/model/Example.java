
package com.example.admin.pineapple.model;

import java.util.List;
import com.squareup.moshi.Json;

public class Example {

    @Json(name = "total_results")
    private Integer totalResults;
    @Json(name = "results")
    private List<Result> results = null;
    @Json(name = "radius")
    private Integer radius;
    @Json(name = "start_date")
    private String startDate;
    @Json(name = "sort")
    private String sort;

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

}
