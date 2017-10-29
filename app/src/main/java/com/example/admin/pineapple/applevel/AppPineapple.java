package com.example.admin.pineapple.applevel;

import android.app.Application;
import android.content.Context;

import com.example.admin.pineapple.data.api.ApiClientModule;

public class AppPineapple extends Application{

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = initDagger(this);
    }

    protected AppComponent initDagger(Context context) {

       return DaggerAppComponent
                .builder()
                .appModule(new AppModule(context))
                .build();
    }

    public AppComponent getAppComponent() {
     return appComponent;
   }


}
