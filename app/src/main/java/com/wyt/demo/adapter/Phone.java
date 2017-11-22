package com.wyt.demo.adapter;

/**
 * Created by wangyt on 2017/11/16.
 * : 适配者
 */

public class Phone implements playable {
    private Iphone8 earPhoneWithLighting;

    public Phone() {
        this.earPhoneWithLighting = new Iphone8();
    }

    @Override
    public void listenMusic() {
        earPhoneWithLighting.listenMusicWithLighting();
    }
}
