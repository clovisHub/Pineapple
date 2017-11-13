package com.example.admin.pineapple.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.admin.pineapple.R;
import com.example.admin.pineapple.applevel.AppPineapple;
import com.example.admin.pineapple.databinding.ActivityEventBinding;
import com.example.admin.pineapple.viewmodel.ViewModelRecycler;

import javax.inject.Inject;

public class EventActivity extends AppCompatActivity {

    @Inject
    ViewModelRecycler vModelMap;

    private ActivityEventBinding eventsActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView( R.layout.activity_events);
        eventsActivityBinding = DataBindingUtil.setContentView(this,R.layout.activity_event);
        ((AppPineapple) this.getApplicationContext()).getAppComponent().inject(this);
        //vModelMap = new ViewModelRecycler(this);
         eventsActivityBinding.setEventsViewModel(vModelMap);
    }

}
