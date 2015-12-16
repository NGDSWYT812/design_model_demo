package com.wyt.demo.template;

import android.util.Log;

/**
 * Created by wangyt on 2015/12/16.
 * : description
 */
public abstract class NormalSex {
    void forePlay() {
        Log.e("wyt", "前戏一分钟");
    }

    void doSex() {
        Log.e("wyt", "正经事三分钟");
    }

    void cleanUp() {
        Log.e("wyt", "清理一分钟");
    }

    public void doWhatYouWant() {
        Log.e("wyt", "开始");
        forePlay();
        Log.e("wyt", "下一步");
        doSex();
        Log.e("wyt", "下一步");
        cleanUp();
        Log.e("wyt", "结束");
    }
}
