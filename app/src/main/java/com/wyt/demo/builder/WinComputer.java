package com.wyt.demo.builder;

/**
 * Created by wangyt on 2015/12/14.
 * : description
 */
public class WinComputer extends Computer {
    @Override
    public void setCpu(int cpu) {
        mCpu = cpu;
    }

    @Override
    public void setArm(int arm) {
        mArm = arm;
    }

    @Override
    public void setOs(String os) {
        mOs = os;
    }
}
