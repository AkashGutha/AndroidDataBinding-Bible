package com.akash.simpledatabinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.akash.simpledatabinding.databinding.ActivityMainBinding;

public class MainActivity extends Activity {
    Data data = new Data("akash", 2, 3.456f, 'G');

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setData(data);

    }
}
