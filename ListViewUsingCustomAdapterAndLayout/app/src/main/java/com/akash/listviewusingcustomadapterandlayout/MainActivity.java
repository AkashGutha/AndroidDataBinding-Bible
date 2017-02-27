package com.akash.listviewusingcustomadapterandlayout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends Activity {

    ListView list;
    ArrayList<Data> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setup data
        data = new ArrayList<>();
        data.add(new Data("akash", 2, new Date()));
        data.add(new Data("akash", 2, new Date()));
        data.add(new Data("akash", 2, new Date()));
        data.add(new Data("akash", 2, new Date()));
        data.add(new Data("akash", 2, new Date()));
        data.add(new Data("akash", 2, new Date()));
        data.add(new Data("akash", 2, new Date()));
        data.add(new Data("akash", 2, new Date()));
        data.add(new Data("akash", 2, new Date()));
        data.add(new Data("akash", 2, new Date()));
        data.add(new Data("akash", 2, new Date()));
        data.add(new Data("akash", 2, new Date()));
        data.add(new Data("akash", 2, new Date()));
        data.add(new Data("akash", 2, new Date()));
        data.add(new Data("akash", 2, new Date()));
        data.add(new Data("akash", 2, new Date()));
        data.add(new Data("akash", 2, new Date()));

        // get reference to lsitview
        list = (ListView ) findViewById(R.id.list);

        // set the custom adapter
        CustomDataAdapter adapter = new CustomDataAdapter(this.getBaseContext(), data);
        list.setAdapter(adapter);

    }
}
