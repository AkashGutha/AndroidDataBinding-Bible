package com.akash.listviewusingcustomadapterandlayout;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.akash.listviewusingcustomadapterandlayout.databinding.RowItemBinding;

import java.util.List;

/**
 * Created by Home on 28-02-2017.
 */

public class CustomDataAdapter extends BaseAdapter {

    List<Data> dataList;
    Context context;

    public CustomDataAdapter(Context context, List<Data> dataList) {
        this.dataList = dataList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int i) {
        return dataList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        RowItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.row_item, viewGroup, false);
        binding.setData((Data) this.getItem(i));
        return binding.getRoot();

    }
}
