package com.withing.designPattern.singleton;

/**
 * @author huangweixin7
 * @date 2020/8/3 22:34:18
 * description: LazyNotSafeSingleton
 */
public class LazyNotSafeSingleton implements Singleton {

    private static LazyNotSafeSingleton instance;

    private LazyNotSafeSingleton() {
    }

    public static LazyNotSafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazyNotSafeSingleton();
        }
        return instance;
    }

}
