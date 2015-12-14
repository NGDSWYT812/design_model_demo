package com.wyt.demo.singleton;

/**
 * Created by wangyt on 2015/12/14.
 * : HungrySingleton
 */
public class HungrySingleton {
    private HungrySingleton() {
    }

    private static HungrySingleton sInstance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return sInstance;
    }
}
