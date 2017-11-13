package com.example.admin.pineapple.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;

import com.example.admin.pineapple.model.AssetTopic;
import com.example.admin.pineapple.model.Place;
import com.example.admin.pineapple.model.Result;

import java.util.List;

public class ViewModelResult extends BaseObservable {

    Context context;
    Result result;

    public ViewModelResult(Result result, Context context) {
        this.result = result;
        this.context = context;
        result.getPlace();
    }

    public Place getPlace(){
        return result.getPlace();
    }

    public String getGeoPoint(){
        return result.getPlace().getGeoPoint().toString();
    }
    public String getCityName(){
        return result.getPlace().getCityName();
    }

    public String getZipCode(){
        return result.getPlace().getPostalCode();
    }

    public String getLongitude(){
        return result.getPlace().getLongitude();
    }

    public String getLatitude(){
        return result.getPlace().getLatitude();
    }

    public List<AssetTopic> getTopics(){
        return result.getAssetTopics();
    }

    public void setResult(Result myResult) {
        this.result = myResult;
        notifyChange();
    }
}
