package com.wyt.demo.factory;

import android.util.Log;

/**
 * Created by wangyt on 2017/11/22.
 * : 简单工厂
 */

public class SimpleFactory {

    public static Product getProduct(String type) {
        switch (type) {
            case "a":
                return new ProductA();
            case "b":
                return new ProductB();
        }
        return null;
    }

    static abstract class Product {
        abstract void use();
    }

    static class ProductA extends Product {
        void use() {
            Log.e("wyt", "getProduct a");
        }
    }

    static class ProductB extends Product {
        void use() {
            Log.e("wyt", "getProduct b");
        }
    }
}

