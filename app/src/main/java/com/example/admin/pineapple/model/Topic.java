
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class Topic {

    @Json(name = "topicId")
    private Integer topicId;
    @Json(name = "topicName")
    private String topicName;
    @Json(name = "topicTaxonomy")
    private String topicTaxonomy;

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicTaxonomy() {
        return topicTaxonomy;
    }

    public void setTopicTaxonomy(String topicTaxonomy) {
        this.topicTaxonomy = topicTaxonomy;
    }

}
