package com.example.admin.pineapple.data.api;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import static com.example.admin.pineapple.data.api.ApiClient.getClientApi;

@Module
public class ApiClientModule {

    @Singleton
    @Provides
    public ApiService getService(){
        return getClientApi();
    }
}
