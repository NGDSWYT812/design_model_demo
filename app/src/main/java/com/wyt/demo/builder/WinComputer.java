package com.wyt.demo.builder;

/**
 * Created by wangyt on 2015/12/14.
 * : window阵营的pc
 */
public class WinComputer extends Computer {
    @Override
    void setCpu(int cpu) {
        mCpu = cpu;
    }

    @Override
    void setRam(int ram) {
        mRam = ram;
    }

    @Override
    void setOs(String os) {
        mOs = os;
    }
}
