package com.wyt.demo.facade;

import android.util.Log;

/**
 * Created by wangyt on 2015/12/16.
 * : description
 */
public class PowerSystem implements IPowerControl {
    @Override
    public void on() {
        Log.e("wyt", "turn on");
    }

    @Override
    public void off() {
        Log.e("wyt", "turn off");
    }

}
