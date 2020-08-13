package com.withing.designPattern.observer;

/**
 * @author huangweixin7
 * @date 2020/7/30 16:54:46
 * description: BinaryDemoObserver
 */
public class BinaryDemoObserver extends AbstractDemoObserver{

    public BinaryDemoObserver(DemoSubject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getSimpleName() + " change state to " + Integer.toBinaryString(subject.getState()));
    }

}
