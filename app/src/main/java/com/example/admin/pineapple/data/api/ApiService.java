package com.example.admin.pineapple.data.api;

;
import com.example.admin.pineapple.BuildConfig;
import com.example.admin.pineapple.model.Example;


import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("/v2/search/?api_key="+ BuildConfig.apikey)
    Call<Example> getLocationCallable(
                                      @Query("query") String eventType,//concert
                                      @Query("lat_lon")String location,//43.2,-118
                                      @Query("per_page")String perPage,//2
                                      @Query("sort")String sort,        //distance
                                      @Query("exclude_children")String exclude // true
                                      );

    @GET("/v2/search/?api_key="+ BuildConfig.apikey)
    Observable<Example> getEventLocation(

            @Query("query") String eventType,//concert
            @Query("lat_lon")String location,//43.2,-118
            @Query("per_page")String perPage,//2
            @Query("sort")String sort,        //distance
            @Query("exclude_children")String exclude // true
    );

}
