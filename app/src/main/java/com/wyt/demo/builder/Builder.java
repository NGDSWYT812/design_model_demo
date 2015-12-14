package com.wyt.demo.builder;

/**
 * Created by wangyt on 2015/12/14.
 * : description
 */
public abstract class Builder {

    public abstract void buildCpu(int cpu);

    public abstract void buildArm(int arm);

    public abstract void buildOs(String os);

    public abstract Computer create();
}
