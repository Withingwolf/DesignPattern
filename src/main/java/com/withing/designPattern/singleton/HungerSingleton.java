package com.withing.designPattern.singleton;

/**
 * @author huangweixin7
 * @date 2020/8/3 22:30:22
 * description: SingletonSubject
 */
public class HungerSingleton implements Singleton {

    private static final HungerSingleton instantce = new HungerSingleton();

    private HungerSingleton() {
    }

    public static HungerSingleton getInstance() {
        return instantce;
    }

}
