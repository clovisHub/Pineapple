
package com.example.admin.pineapple.model;

import java.util.List;
import com.squareup.moshi.Json;

public class AssetComponent {

    @Json(name = "sequence")
    private Object sequence;
    @Json(name = "activityStartDate")
    private String activityStartDate;
    @Json(name = "assetSeoUrls")
    private List<Object> assetSeoUrls = null;
    @Json(name = "assetGuid")
    private String assetGuid;
    @Json(name = "activityEndDate")
    private String activityEndDate;
    @Json(name = "assetName")
    private String assetName;

    public Object getSequence() {
        return sequence;
    }

    public void setSequence(Object sequence) {
        this.sequence = sequence;
    }

    public String getActivityStartDate() {
        return activityStartDate;
    }

    public void setActivityStartDate(String activityStartDate) {
        this.activityStartDate = activityStartDate;
    }

    public List<Object> getAssetSeoUrls() {
        return assetSeoUrls;
    }

    public void setAssetSeoUrls(List<Object> assetSeoUrls) {
        this.assetSeoUrls = assetSeoUrls;
    }

    public String getAssetGuid() {
        return assetGuid;
    }

    public void setAssetGuid(String assetGuid) {
        this.assetGuid = assetGuid;
    }

    public String getActivityEndDate() {
        return activityEndDate;
    }

    public void setActivityEndDate(String activityEndDate) {
        this.activityEndDate = activityEndDate;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

}
