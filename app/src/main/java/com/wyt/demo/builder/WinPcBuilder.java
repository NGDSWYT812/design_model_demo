package com.wyt.demo.builder;

/**
 * Created by wangyt on 2015/12/14.
 * : description
 */
public class WinPcBuilder extends Builder {

    private Computer mComputer = new WinComputer();

    @Override
    public WinPcBuilder buildCpu(int cpu) {
        mComputer.setCpu(cpu);
        return this;
    }

    @Override
    public WinPcBuilder buildRam(int ram) {
        mComputer.setRam(ram);
        return this;
    }

    @Override
    public WinPcBuilder buildOs(String os) {
        mComputer.setOs(os);
        return this;
    }

    @Override
    public Computer create() {
        return mComputer;
    }

}
