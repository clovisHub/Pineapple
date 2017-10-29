
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class ClickTypes {

    @Json(name = "otherActive")
    private Integer otherActive;
    @Json(name = "registration")
    private Integer registration;
    @Json(name = "nonActive")
    private Integer nonActive;

    public Integer getOtherActive() {
        return otherActive;
    }

    public void setOtherActive(Integer otherActive) {
        this.otherActive = otherActive;
    }

    public Integer getRegistration() {
        return registration;
    }

    public void setRegistration(Integer registration) {
        this.registration = registration;
    }

    public Integer getNonActive() {
        return nonActive;
    }

    public void setNonActive(Integer nonActive) {
        this.nonActive = nonActive;
    }

}
