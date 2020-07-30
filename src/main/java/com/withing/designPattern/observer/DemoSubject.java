package com.withing.designPattern.observer;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangweixin7
 * @date 2020/7/30 16:50:07
 * description: Subject
 */
public class DemoSubject {

    List<AbstractDemoObserver> observerList = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(AbstractDemoObserver observer) {
        observerList.add(observer);
    }

    public void notifyAllObserver() {
        for (AbstractDemoObserver observer : observerList) {
            observer.update();
        }
    }

}
