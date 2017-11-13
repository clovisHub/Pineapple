package com.example.admin.pineapple.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.util.Log;

import com.example.admin.pineapple.MainActivity;
import com.example.admin.pineapple.applevel.AppPineapple;
import com.example.admin.pineapple.data.api.ApiService;
import com.example.admin.pineapple.model.Example;
import com.example.admin.pineapple.model.Result;
import com.example.admin.pineapple.view.MapsActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static java.security.AccessController.getContext;

public class ViewModelRecycler extends Observable{

    @Inject
    ApiService apiService;

    CompositeDisposable compositeDisposable = new CompositeDisposable();

    private static List<Result> results = new ArrayList<>();

    @Inject
    public ViewModelRecycler(Context context){
        ((AppPineapple) context).getAppComponent().inject(this);
    }

    public static List<Result> getResults(){
        return results;
    }

    public void fetchObservableEvents(String coordinates){
        
        //String check = coordinates;

        Disposable disposable = apiService.getEventLocation("concert",coordinates,"10","distance","true")
                                             .subscribeOn(Schedulers.io())
                                             .observeOn(AndroidSchedulers.mainThread())
                                             .subscribe(new Consumer<Example>() {
                                                 @Override
                                                 public void accept(Example example) throws Exception {

                                                     Log.d("ObservationA", "accept: " + example.getResults().get(0).getPlace().getCityName());
                                                     Log.d("ObservationB", "accept: " + example.getResults().size());
                                                    /* int i = 0;
                                                     for (Result obj:example.getResults()) {
                                                         
                                                         Log.d("ObservationC"+i, "accept: " + example.getResults().get(i).getPlace().getLatitude());

                                                         Log.d("ObservationD"+i, "accept: " + example.getResults().get(i).getPlace().getLongitude());
                                                         
                                                         Log.d("ObservationE"+i, "accept: " + example.getResults().get(i).getPlace().getPostalCode());
                                                         i++;
                                                         results.add(obj);

                                                     }*/
                                                     changeEventDataSet(example.getResults());

                                                 }
                                             }, new Consumer<Throwable>() {
                                                 @Override
                                                 public void accept(Throwable throwable) throws Exception {
                                                     Log.d("ObserveError", "accept: an error  happened"+
                                                             throwable.getMessage());
                                                 }
                                             });

        compositeDisposable.add(disposable);

    }

    public void fetchEvents(String coordinates){
       apiService.getLocationCallable("concert","33.7,-84","5","distance", "true")
                  .enqueue(new Callback<Example>() {
                      @Override
                      public void onResponse(Call<Example> call, Response<Example> response) {

                          if(response.isSuccessful()){

                             //Log.d("callableA",response.body().getResults().get(1).getAssetDescriptions().get(0).getDescription().toString());
                             // Log.d("callableB",Integer.toString(response.body().getResults().size()));

                             /* int i = 0;

                              for (Result obj:response.body().getResults()) {

                                    Log.d("ObservationC"+i, "accept: " + response.body().getResults().get(i).getPlace().getLatitude());

                                    Log.d("ObservationD"+i, "accept: " + response.body().getResults().get(i).getPlace().getLongitude());

                                    Log.d("ObservationE"+i, "accept: " + response.body().getResults().get(i).getPlace().getPostalCode());

                                    i++;
                                    results.add(obj);
                              }*/
                              changeEventDataSet(response.body().getResults());

                          }

                      }

                      @Override
                      public void onFailure(Call<Example> call, Throwable t) {

                      }
                  });

    }

    private void changeEventDataSet(List<Result> myResults) {
        results.addAll(myResults);
        setChanged();
        notifyObservers();
    }




}
