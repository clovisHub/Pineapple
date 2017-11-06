package com.example.admin.pineapple.applevel;

import com.example.admin.pineapple.MainActivity;
import com.example.admin.pineapple.data.api.ApiClientModule;
import com.example.admin.pineapple.view.MapsActivity;
import com.example.admin.pineapple.viewmodel.ViewModelMapRecycler;

import javax.inject.Singleton;
import dagger.Component;

@Component(modules = {AppModule.class, ApiClientModule.class})
@Singleton
public interface AppComponent {

    void inject(ViewModelMapRecycler target);
    void inject(MainActivity target);
    void inject(MapsActivity target);
}
