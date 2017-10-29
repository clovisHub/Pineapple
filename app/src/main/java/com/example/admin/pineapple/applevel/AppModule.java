package com.example.admin.pineapple.applevel;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    Context context;
    public AppModule(Context contex){
        context  = contex;
    }

    @Provides
    @Singleton
    public Context getContext(){
        return context;
    }
}
