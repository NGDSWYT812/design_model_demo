package com.wyt.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.wyt.demo.builder.Builder;
import com.wyt.demo.builder.Computer;
import com.wyt.demo.builder.WinPcBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Builder builder = new WinPcBuilder();
        Computer computer = builder.buildOs("windows")
                .buildRam(1024)
                .buildCpu(4)
                .create();
        Log.e("wyt", computer.toString());
    }
}
