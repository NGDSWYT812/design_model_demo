package com.wyt.demo.adapter;

/**
 * Created by wangyt on 2017/11/16.
 * : description
 */

public class Phone implements EarPhone {
    private EarPhoneWithLighting earPhoneWithLighting;

    public Phone() {
        this.earPhoneWithLighting = new EarPhoneWithLighting();
    }

    @Override
    public void listenMusic() {
        earPhoneWithLighting.listenMusicWithLighting();
    }
}
