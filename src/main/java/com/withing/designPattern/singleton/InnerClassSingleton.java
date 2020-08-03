package com.withing.designPattern.singleton;

/**
 * @author huangweixin7
 * @date 2020/8/3 22:47:16
 * description: InnerClassSingleton
 */
public class InnerClassSingleton implements Singleton{

    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return InnerSingleton.instance;
    }

    private static class InnerSingleton {
        public static final InnerClassSingleton instance = new InnerClassSingleton();
    }

}
