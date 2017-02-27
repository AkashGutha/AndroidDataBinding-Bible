package com.akash.simplelistviewdatabinding;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {


    ListView listView;
    String data[] = {
            "akash",
            "radhika",
            "seshu",
            "sunny",
            "jhansi"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the lsitview
        listView =  (ListView) findViewById(R.id.list);

        // set the adapter's context to this file and get a predefined layout from android.
        // set data to data variable created in the scope of this class
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);

        // set the adapter to the listview
        listView.setAdapter(adapter);

    }
}
