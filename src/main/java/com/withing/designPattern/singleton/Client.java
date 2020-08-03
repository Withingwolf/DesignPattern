package com.withing.designPattern.singleton;

import org.junit.Test;

/**
 * @author huangweixin7
 * @date 2020/8/3 22:29:56
 * description: Client
 */
public class Client {

    @Test
    public void hungerSingleton() {
        HungerSingleton hungerSingleton = HungerSingleton.getInstance();
        hungerSingleton.doSomething();
    }

    @Test
    public void lazyNotSafeSingleton() {
        LazyNotSafeSingleton lazyNotSafeSingleton = LazyNotSafeSingleton.getInstance();
        lazyNotSafeSingleton.doSomething();
    }

    @Test
    public void lazySafeSingleton() {
        LazySafeSingleton lazySafeSingleton = LazySafeSingleton.getInstance();
        lazySafeSingleton.doSomething();
    }

    @Test
    public void doubleCheckSingleton() {
        DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
        doubleCheckSingleton.doSomething();
    }

    @Test
    public void innerClassSingleton() {
        InnerClassSingleton innerClassSingleton = InnerClassSingleton.getInstance();
        innerClassSingleton.doSomething();
    }

    @Test
    public void enumSingleton() {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.doSomething();
    }

}
