package com.withing.designPattern.observer;

/**
 * @author huangweixin7
 * @date 2020/7/30 16:53:31
 * description: HexAbstractDemoObserver
 */
public class HexaDemoObserver extends AbstractDemoObserver {

    public HexaDemoObserver(DemoSubject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getSimpleName() + " change state to " + Integer.toHexString(subject.getState()));
    }
}
