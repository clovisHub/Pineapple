
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class AssetTopic {

    @Json(name = "sequence")
    private String sequence;
    @Json(name = "topic")
    private Topic topic;

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

}
