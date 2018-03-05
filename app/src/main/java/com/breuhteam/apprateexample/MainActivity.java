package com.breuhteam.apprateexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.breuhteam.apprate.AppRate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppRate.app_launched(this,"com.breuhteam.diy");
    }
}
