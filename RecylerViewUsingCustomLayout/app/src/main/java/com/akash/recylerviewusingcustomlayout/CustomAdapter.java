package com.akash.recylerviewusingcustomlayout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.akash.recylerviewusingcustomlayout.databinding.RowItemBinding;

/**
 * Created by Home on 28-02-2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    LayoutInflater inflater;

    public CustomAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RowItemBinding binding = RowItemBinding.inflate(inflater, parent, false);
        return new CustomViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
      
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    static class CustomViewHolder extends RecyclerView.ViewHolder {
        public CustomViewHolder(View itemView) {
            super(itemView);
        }
    }
}
