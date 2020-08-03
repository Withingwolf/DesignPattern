package com.withing.designPattern.singleton;

/**
 * @author huangweixin7
 * @date 2020/8/3 22:38:09
 * description: LazySafeSingleton
 */
public class LazySafeSingleton implements Singleton {

    private static LazySafeSingleton instance;

    private LazySafeSingleton() {
    }

    public static synchronized LazySafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazySafeSingleton();
        }
        return instance;
    }

}
