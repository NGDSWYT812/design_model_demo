package com.wyt.demo.facade;

import android.util.Log;

/**
 * Created by wangyt on 2015/12/16.
 * : description
 */
public class VoiceSystem implements IVoiceControl {
    @Override
    public void turnUp() {
        Log.e("wyt", "up voice");
    }

    @Override
    public void turnDown() {
        Log.e("wyt", "down voice");
    }

}
