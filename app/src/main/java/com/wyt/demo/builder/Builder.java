package com.wyt.demo.builder;

/**
 * Created by wangyt on 2015/12/14.
 * : builder基类
 */
public abstract class Builder {

    public abstract Builder buildCpu(int cpu);

    public abstract Builder buildRam(int ram);

    public abstract Builder buildOs(String os);

    public abstract Computer create();
}
