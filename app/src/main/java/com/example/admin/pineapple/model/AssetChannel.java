
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class AssetChannel {

    @Json(name = "sequence")
    private Integer sequence;
    @Json(name = "channel")
    private Channel channel;

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

}
