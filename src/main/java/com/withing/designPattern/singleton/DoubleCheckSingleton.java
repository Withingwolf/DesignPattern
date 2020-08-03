package com.withing.designPattern.singleton;

/**
 * @author huangweixin7
 * @date 2020/8/3 22:42:31
 * description: DoubleCheckSingleton
 */
public class DoubleCheckSingleton implements Singleton {

    private volatile static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

}
