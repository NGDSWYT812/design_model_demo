package com.wyt.demo.proxy;

import android.util.Log;

/**
 * Created by wangyt on 2015/12/16.
 * : description
 */
public class WhoreMaster implements ISomethingDirty {
    Whore whore;

    public WhoreMaster() {
        Log.e("wyt", "WhoreMaster：我是拉皮条的");
        whore = new Whore();
    }

    @Override
    public void whoredom() {
        if (whore != null) {
            Log.e("wyt", "WhoreMaster：帮你找到一个");
            whore.whoredom();
        }
    }
}
