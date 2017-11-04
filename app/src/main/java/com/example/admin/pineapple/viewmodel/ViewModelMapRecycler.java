package com.example.admin.pineapple.viewmodel;

import android.content.Context;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.util.Log;

import com.example.admin.pineapple.applevel.AppPineapple;
import com.example.admin.pineapple.data.api.ApiService;
import com.example.admin.pineapple.model.Example;

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

public class ViewModelMapRecycler extends Observable{

    @Inject
    ApiService apiService;

    CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Inject
    public ViewModelMapRecycler(Context context){
        ((AppPineapple) context).getAppComponent().inject(this);
    }

    public void fetchObservableEvents(){

        Disposable disposable = apiService.getEventLocation("concert","33,-84","10","distance","true")
                                             .subscribeOn(Schedulers.io())
                                             .observeOn(AndroidSchedulers.mainThread())
                                             .subscribe(new Consumer<Example>() {
                                                 @Override
                                                 public void accept(Example example) throws Exception {

                                                     Log.d("ObservationA", "accept: " + example.getResults().get(0).getAssetDescriptions().get(0).getDescription().toString());

                                                 }
                                             }, new Consumer<Throwable>() {
                                                 @Override
                                                 public void accept(Throwable throwable) throws Exception {
                                                     Log.d("ObserveError", "accept: an error  happened");
                                                 }
                                             });

        compositeDisposable.add(disposable);

    }

    public void fetchEvents(){
       apiService.getLocationCallable("concert","33, -84","5","distance","true")
                  .enqueue(new Callback<Example>() {
                      @Override
                      public void onResponse(Call<Example> call, Response<Example> response) {

                          if(response.isSuccessful()){

                              Log.d("yourself",response.body().getResults().get(1).getAssetDescriptions().get(0).getDescription().toString());
                              Log.d("youme",response.body().getResults().get(1).getActivityStartDate().toString());
                          }

                      }

                      @Override
                      public void onFailure(Call<Example> call, Throwable t) {

                      }
                  });

    }


}
