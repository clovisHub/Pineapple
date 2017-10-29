
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class Channel {

    @Json(name = "channelDsc")
    private String channelDsc;
    @Json(name = "channelName")
    private String channelName;
    @Json(name = "channelId")
    private Integer channelId;

    public String getChannelDsc() {
        return channelDsc;
    }

    public void setChannelDsc(String channelDsc) {
        this.channelDsc = channelDsc;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

}
