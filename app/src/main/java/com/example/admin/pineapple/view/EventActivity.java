package com.example.admin.pineapple.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.admin.pineapple.R;
import com.example.admin.pineapple.applevel.AppPineapple;
import com.example.admin.pineapple.databinding.ActivityEventBinding;
import com.example.admin.pineapple.viewmodel.ViewModelRecycler;

import java.util.Observable;
import java.util.Observer;

import javax.inject.Inject;

public class EventActivity extends AppCompatActivity implements Observer {

    @Inject
    ViewModelRecycler vModelMap;

    EventsAdapter adapter;

    private ActivityEventBinding eventsActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView( R.layout.activity_events);
        eventsActivityBinding = DataBindingUtil.setContentView(this,R.layout.activity_event);
        ((AppPineapple) this.getApplicationContext()).getAppComponent().inject(this);
        //vModelMap = new ViewModelRecycler(this);
         eventsActivityBinding.setEventsViewModel(vModelMap);
         setResultRecyclerView(eventsActivityBinding.listEventId);
         vModelMap.addObserver(this);
    }

    private void setResultRecyclerView(RecyclerView resultsView) {
        adapter = new EventsAdapter();
        resultsView.setAdapter(adapter);
        resultsView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof ViewModelRecycler) {
            ViewModelRecycler viewModelRecycler = (ViewModelRecycler) observable;
            adapter.setResultsList(viewModelRecycler.getResults());
        }
    }
}
