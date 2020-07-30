package com.withing.designPattern.observer;

/**
 * @author huangweixin7
 * @date 2020/7/30 16:54:14
 * description: OctdemoObserver
 */
public class OctalDemoObserver extends AbstractDemoObserver{

    public OctalDemoObserver(DemoSubject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(Integer.toOctalString(subject.getState()));
    }
}
