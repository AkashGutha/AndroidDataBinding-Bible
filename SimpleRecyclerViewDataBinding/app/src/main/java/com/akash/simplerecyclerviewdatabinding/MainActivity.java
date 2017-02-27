package com.akash.simplerecyclerviewdatabinding;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends Activity {

    RecyclerView view;
    String data[] = {
            "akash",
            "radhika",
            "seshu",
            "sunny",
            "jhansi",
            "A d rao",
            "Sunny"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find and get reference to the view.
        view = (RecyclerView) findViewById(R.id.view);

        //set teh layout manager for the recycler view
        view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        view.hasFixedSize();

        // make a sismple array adapter
        DataAdapter adapter = new DataAdapter(data);

        // set the adapter
        view.setAdapter(adapter);

    }
}
