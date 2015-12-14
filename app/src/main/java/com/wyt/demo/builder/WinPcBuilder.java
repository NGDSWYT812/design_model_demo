package com.wyt.demo.builder;

/**
 * Created by wangyt on 2015/12/14.
 * : description
 */
public class WinPcBuilder extends Builder {

    private Computer mComputer = new WinComputer();

    @Override
    public void buildCpu(int cpu) {
        mComputer.setCpu(cpu);
    }

    @Override
    public void buildArm(int arm) {
        mComputer.setArm(arm);
    }

    @Override
    public void buildOs(String os) {
        mComputer.setOs(os);
    }

    @Override
    public Computer create() {
        return mComputer;
    }


}
