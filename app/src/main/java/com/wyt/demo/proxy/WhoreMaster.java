package com.wyt.demo.proxy;

import android.util.Log;

/**
 * Created by wangyt on 2015/12/16.
 * : 妈妈桑
 */
public class WhoreMaster implements IDoSomethingDirty {
    Whore whore;

    public WhoreMaster() {
        Log.e("wyt", "WhoreMaster：我是拉皮条的");
        Log.e("wyt", "WhoreMaster：你自己找不到的，我帮你找一个");
        whore = new Whore();
    }

    @Override
    public void whoredom() {
        whore.whoredom();
    }
}
