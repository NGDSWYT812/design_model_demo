package com.wyt.demo.facade;

/**
 * Created by wangyt on 2015/12/16.
 * : description
 */
public class Controller {
    IPowerControl pControl;
    IVoiceControl vControl;

    public Controller() {
        pControl = new PowerSystem();
        vControl = new VoiceSystem();
    }

    public void turnOn() {
        pControl.on();
    }

    public void turnOff() {
        pControl.off();
    }

    public void turnUp() {
        vControl.turnUp();
    }

    public void turnDown() {
        vControl.turnDown();
    }
}
