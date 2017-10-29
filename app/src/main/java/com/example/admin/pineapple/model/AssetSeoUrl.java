
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class AssetSeoUrl {

    @Json(name = "seoSystemName")
    private String seoSystemName;
    @Json(name = "statusCode")
    private Boolean statusCode;
    @Json(name = "urlAdr")
    private String urlAdr;

    public String getSeoSystemName() {
        return seoSystemName;
    }

    public void setSeoSystemName(String seoSystemName) {
        this.seoSystemName = seoSystemName;
    }

    public Boolean getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Boolean statusCode) {
        this.statusCode = statusCode;
    }

    public String getUrlAdr() {
        return urlAdr;
    }

    public void setUrlAdr(String urlAdr) {
        this.urlAdr = urlAdr;
    }

}
