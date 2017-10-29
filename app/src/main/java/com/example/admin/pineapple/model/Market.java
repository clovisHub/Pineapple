
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class Market {

    @Json(name = "marketName")
    private String marketName;
    @Json(name = "marketId")
    private Integer marketId;

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public Integer getMarketId() {
        return marketId;
    }

    public void setMarketId(Integer marketId) {
        this.marketId = marketId;
    }

}
