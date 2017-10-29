
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class Frequency {

    @Json(name = "frequencyName")
    private String frequencyName;

    public String getFrequencyName() {
        return frequencyName;
    }

    public void setFrequencyName(String frequencyName) {
        this.frequencyName = frequencyName;
    }

}
