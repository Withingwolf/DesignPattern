package com.withing.designPattern.observer;



/**
 * @author huangweixin7
 * @date 2020/7/30 16:50:35
 * description: Client
 */
public class DemoClient {

    public static void main(String[] args) {
        DemoSubject subject = new DemoSubject();
        new BinaryDemoObserver(subject);
        new OctalDemoObserver(subject);
        new HexaDemoObserver(subject);
        subject.setState(10);
        subject.setState(16);

    }

}
