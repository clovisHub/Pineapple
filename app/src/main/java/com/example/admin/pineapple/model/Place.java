
package com.example.admin.pineapple.model;

import com.squareup.moshi.Json;

public class Place {

    @Json(name = "placeDsc")
    private String placeDsc;
    @Json(name = "placeUrlAdr")
    private String placeUrlAdr;
    @Json(name = "showPlaceName")
    private Boolean showPlaceName;
    @Json(name = "timezone")
    private String timezone;
    @Json(name = "postalCode")
    private String postalCode;
    @Json(name = "latitude")
    private String latitude;
    @Json(name = "directionsTxt")
    private String directionsTxt;
    @Json(name = "addressLine2Txt")
    private String addressLine2Txt;
    @Json(name = "geoPoint")
    private GeoPoint geoPoint;
    @Json(name = "addressLine1Txt")
    private String addressLine1Txt;
    @Json(name = "stateProvinceCode")
    private String stateProvinceCode;
    @Json(name = "localityName")
    private String localityName;
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
    @Json(name = "placeGuid")
    private String placeGuid;
    @Json(name = "placeName")
    private String placeName;
    @Json(name = "longitude")
    private String longitude;

    public String getPlaceDsc() {
        return placeDsc;
    }

    public void setPlaceDsc(String placeDsc) {
        this.placeDsc = placeDsc;
    }

    public String getPlaceUrlAdr() {
        return placeUrlAdr;
    }

    public void setPlaceUrlAdr(String placeUrlAdr) {
        this.placeUrlAdr = placeUrlAdr;
    }

    public Boolean getShowPlaceName() {
        return showPlaceName;
    }

    public void setShowPlaceName(Boolean showPlaceName) {
        this.showPlaceName = showPlaceName;
    }

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

    public String getDirectionsTxt() {
        return directionsTxt;
    }

    public void setDirectionsTxt(String directionsTxt) {
        this.directionsTxt = directionsTxt;
    }

    public String getAddressLine2Txt() {
        return addressLine2Txt;
    }

    public void setAddressLine2Txt(String addressLine2Txt) {
        this.addressLine2Txt = addressLine2Txt;
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

    public String getLocalityName() {
        return localityName;
    }

    public void setLocalityName(String localityName) {
        this.localityName = localityName;
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

    public String getPlaceGuid() {
        return placeGuid;
    }

    public void setPlaceGuid(String placeGuid) {
        this.placeGuid = placeGuid;
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

    @Override
    public String toString() {
        return "Place{" +
                "placeDsc='" + placeDsc + '\'' +
                ", placeUrlAdr='" + placeUrlAdr + '\'' +
                ", showPlaceName=" + showPlaceName +
                ", timezone='" + timezone + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", latitude='" + latitude + '\'' +
                ", directionsTxt='" + directionsTxt + '\'' +
                ", addressLine2Txt='" + addressLine2Txt + '\'' +
                ", geoPoint=" + geoPoint +
                ", addressLine1Txt='" + addressLine1Txt + '\'' +
                ", stateProvinceCode='" + stateProvinceCode + '\'' +
                ", localityName='" + localityName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", timezoneOffset=" + timezoneOffset +
                ", timezoneDST=" + timezoneDST +
                ", countryCode='" + countryCode + '\'' +
                ", dma=" + dma +
                ", countryName='" + countryName + '\'' +
                ", placeGuid='" + placeGuid + '\'' +
                ", placeName='" + placeName + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }
}
