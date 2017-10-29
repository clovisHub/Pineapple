
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class AssetQuantity {

    @Json(name = "waitlistCnt")
    private String waitlistCnt;
    @Json(name = "soldCnt")
    private String soldCnt;
    @Json(name = "createdDate")
    private String createdDate;
    @Json(name = "availableCnt")
    private String availableCnt;
    @Json(name = "modifiedDate")
    private String modifiedDate;
    @Json(name = "capacityNb")
    private String capacityNb;
    @Json(name = "waitlistCapacityNb")
    private String waitlistCapacityNb;

    public String getWaitlistCnt() {
        return waitlistCnt;
    }

    public void setWaitlistCnt(String waitlistCnt) {
        this.waitlistCnt = waitlistCnt;
    }

    public String getSoldCnt() {
        return soldCnt;
    }

    public void setSoldCnt(String soldCnt) {
        this.soldCnt = soldCnt;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getAvailableCnt() {
        return availableCnt;
    }

    public void setAvailableCnt(String availableCnt) {
        this.availableCnt = availableCnt;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCapacityNb() {
        return capacityNb;
    }

    public void setCapacityNb(String capacityNb) {
        this.capacityNb = capacityNb;
    }

    public String getWaitlistCapacityNb() {
        return waitlistCapacityNb;
    }

    public void setWaitlistCapacityNb(String waitlistCapacityNb) {
        this.waitlistCapacityNb = waitlistCapacityNb;
    }

}
