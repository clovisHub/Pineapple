
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class AssetStatus {

    @Json(name = "assetStatusId")
    private String assetStatusId;
    @Json(name = "assetStatusName")
    private String assetStatusName;

    public String getAssetStatusId() {
        return assetStatusId;
    }

    public void setAssetStatusId(String assetStatusId) {
        this.assetStatusId = assetStatusId;
    }

    public String getAssetStatusName() {
        return assetStatusName;
    }

    public void setAssetStatusName(String assetStatusName) {
        this.assetStatusName = assetStatusName;
    }

}
