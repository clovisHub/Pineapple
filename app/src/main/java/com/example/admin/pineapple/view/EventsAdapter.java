package com.example.admin.pineapple.view;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.admin.pineapple.R;
import com.example.admin.pineapple.databinding.SingleEventBinding;
import com.example.admin.pineapple.model.Result;
import com.example.admin.pineapple.viewmodel.ViewModelResult;

import java.util.Collections;
import java.util.List;

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.EventsAdapterViewHolder>{


    private List<Result> resultsList;

    public EventsAdapter() {
        this.resultsList = Collections.emptyList();
    }

    public void setResultsList(List<Result> resultList) {
        this.resultsList = resultList;
        notifyDataSetChanged();
    }



    @Override
    public EventsAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        SingleEventBinding singleEventBinding = DataBindingUtil
                                              .inflate(LayoutInflater.from(parent.getContext()), R.layout.single_event,
                                                       parent, false);

        return new EventsAdapterViewHolder(singleEventBinding);
    }

    @Override
    public void onBindViewHolder(EventsAdapterViewHolder holder, int position) {

        holder.bindResult(resultsList.get(position));
    }

    @Override
    public int getItemCount() {
        return resultsList.size();
    }

    public class EventsAdapterViewHolder extends RecyclerView.ViewHolder {

        SingleEventBinding singleEventBinding;

        public EventsAdapterViewHolder(SingleEventBinding singleEv) {
            super(singleEv.singleResultId);
            this.singleEventBinding = singleEv;
        }

        void bindResult(Result result) {
            if (singleEventBinding.getViewModelResult() == null) {
                singleEventBinding.setViewModelResult(
                        new ViewModelResult(result, itemView.getContext()));
            } else {
                singleEventBinding.getViewModelResult().setResult(result);
            }
        }
    }
}
