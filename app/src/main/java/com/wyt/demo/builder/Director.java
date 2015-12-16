package com.wyt.demo.builder;

import android.util.Log;

/**
 * Created by wangyt on 2015/12/14.
 * : description
 */
public class Director {
    public Director() {
        initPc();
    }

    private void initPc() {
        Builder builder = new WinPcBuilder();
        Computer computer = builder
                .buildCpu(4)
                .buildRam(1024)
                .buildOs("windows")
                .create();
        Log.e("wyt", computer.toString());
    }
}
