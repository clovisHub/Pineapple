
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class GeoPoint {

    @Json(name = "lon")
    private String lon;
    @Json(name = "lat")
    private String lat;

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

}
