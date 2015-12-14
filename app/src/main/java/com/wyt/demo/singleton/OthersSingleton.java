package com.wyt.demo.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangyt on 2015/12/14.
 * : OthersSingleton
 */
public class OthersSingleton {
    private static OthersSingleton sInstance = null;

    private OthersSingleton() {
    }

    //lazy
    public static OthersSingleton getInstanceLazy() {
        if (null == sInstance) {
            sInstance = new OthersSingleton();
        }
        return sInstance;
    }

    //double check
    public static OthersSingleton getInstance() {
        if (null == sInstance) {
            synchronized (OthersSingleton.class) {
                if (null == sInstance) {
                    sInstance = new OthersSingleton();
                }
            }
        }
        return sInstance;
    }

    //inner static class
    public static OthersSingleton getInstanceFromHolder() {
        return SingletonHolder.sInstanceInner;
    }

    private static class SingletonHolder {
        private static final OthersSingleton sInstanceInner = new OthersSingleton();
    }

    //enum
    enum SingtonEnum {
        INSTANCE;
    }


    //Instance container;
    private static Map<String, OthersSingleton> objMap = new HashMap<String, OthersSingleton>();

    public static void registerInstance(String key, OthersSingleton instance) {
        if (!objMap.containsKey(key)) {
            objMap.put(key, instance);
        }
    }

    public static OthersSingleton getInstanceFormContainer(String key) {
        return objMap.get(key);
    }

}
