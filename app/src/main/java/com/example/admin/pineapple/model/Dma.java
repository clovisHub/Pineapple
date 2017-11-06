
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class Dma {

    @Json(name = "dmaId")
    private String dmaId;
    @Json(name = "dmaName")
    private String dmaName;

    public String getDmaId() {
        return dmaId;
    }

    public void setDmaId(String dmaId) {
        this.dmaId = dmaId;
    }

    public String getDmaName() {
        return dmaName;
    }

    public void setDmaName(String dmaName) {
        this.dmaName = dmaName;
    }

}
