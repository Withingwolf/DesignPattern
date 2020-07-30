package com.withing.designPattern.observer;


/**
 * @author huangweixin7
 * @date 2020/7/30 16:49:46
 * description: Observation
 */
public abstract class AbstractDemoObserver {

    protected DemoSubject subject;

    public abstract void update();

}
