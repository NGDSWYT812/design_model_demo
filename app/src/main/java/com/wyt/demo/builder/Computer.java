package com.wyt.demo.builder;

/**
 * Created by wangyt on 2015/12/14.
 * : description
 */
public abstract class Computer {
    int mCpu;
    int mArm;
    String mOs;

    public abstract void setCpu(int cpu);

    public abstract void setArm(int arm);

    public abstract void setOs(String os);
}
