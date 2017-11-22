package com.wyt.demo.builder;

/**
 * Created by wangyt on 2015/12/14.
 * : computer基类
 */
public abstract class Computer {
    int mCpu;
    int mRam;
    String mOs;

    abstract void setCpu(int cpu);

    abstract void setRam(int ram);

    abstract void setOs(String os);

    @Override
    public String toString() {
        return "Computer [CpuCore=" + mCpu + ", RamSize=" + mRam
                + ", Os=" + mOs + "]";
    }
}
