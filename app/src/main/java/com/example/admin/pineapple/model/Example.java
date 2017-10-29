
package com.example.admin.pineapple.model;

import java.util.List;
import com.squareup.moshi.Json;

public class Example {

    @Json(name = "retries")
    private Integer retries;
    @Json(name = "total_results")
    private Integer totalResults;
    @Json(name = "items_per_page")
    private Integer itemsPerPage;
    @Json(name = "start_index")
    private Integer startIndex;
    @Json(name = "facets")
    private List<Object> facets = null;
    @Json(name = "facet_values")
    private List<Object> facetValues = null;
    @Json(name = "suggestions")
    private List<Object> suggestions = null;
    @Json(name = "results")
    private List<Result> results = null;
    @Json(name = "radius")
    private String radius;
    @Json(name = "start_date")
    private String startDate;
    @Json(name = "sort")
    private String sort;

    public Integer getRetries() {
        return retries;
    }

    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Integer getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(Integer itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public List<Object> getFacets() {
        return facets;
    }

    public void setFacets(List<Object> facets) {
        this.facets = facets;
    }

    public List<Object> getFacetValues() {
        return facetValues;
    }

    public void setFacetValues(List<Object> facetValues) {
        this.facetValues = facetValues;
    }

    public List<Object> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<Object> suggestions) {
        this.suggestions = suggestions;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
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
