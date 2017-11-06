
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class Place {

    @Json(name = "timezone")
    private String timezone;
    @Json(name = "postalCode")
    private String postalCode;
    @Json(name = "latitude")
    private String latitude;
    @Json(name = "geoPoint")
    private GeoPoint geoPoint;
    @Json(name = "addressLine1Txt")
    private String addressLine1Txt;
    @Json(name = "stateProvinceCode")
    private String stateProvinceCode;
    @Json(name = "cityName")
    private String cityName;
    @Json(name = "timezoneOffset")
    private Integer timezoneOffset;
    @Json(name = "timezoneDST")
    private Integer timezoneDST;
    @Json(name = "countryCode")
    private String countryCode;
    @Json(name = "dma")
    private Dma dma;
    @Json(name = "countryName")
    private String countryName;
    @Json(name = "placeName")
    private String placeName;
    @Json(name = "longitude")
    private String longitude;

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public GeoPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    public String getAddressLine1Txt() {
        return addressLine1Txt;
    }

    public void setAddressLine1Txt(String addressLine1Txt) {
        this.addressLine1Txt = addressLine1Txt;
    }

    public String getStateProvinceCode() {
        return stateProvinceCode;
    }

    public void setStateProvinceCode(String stateProvinceCode) {
        this.stateProvinceCode = stateProvinceCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(Integer timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public Integer getTimezoneDST() {
        return timezoneDST;
    }

    public void setTimezoneDST(Integer timezoneDST) {
        this.timezoneDST = timezoneDST;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Dma getDma() {
        return dma;
    }

    public void setDma(Dma dma) {
        this.dma = dma;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

}
