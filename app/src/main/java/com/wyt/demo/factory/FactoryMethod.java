package com.wyt.demo.factory;

import android.util.Log;

/**
 * Created by wangyt on 2017/11/22.
 * : 工厂方法
 */

public class FactoryMethod {
    static abstract class Factory {
        abstract Product getProduct();
    }

    static class FactoryA extends Factory {
        Product getProduct() {
            return new ProductA();
        }
    }

    static class FactoryB extends Factory {
        Product getProduct() {
            return new ProductB();
        }
    }

    static abstract class Product {
        abstract void use();
    }

    static class ProductA extends Product {
        void use() {
            Log.e("wyt", "use a");
        }
    }

    static class ProductB extends Product {
        void use() {
            Log.e("wyt", "use b");
        }
    }
}

