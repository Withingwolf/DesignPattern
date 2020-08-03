package com.withing.designPattern.singleton;

/**
 * @author huangweixin7
 * @date 2020/8/3 22:36:35
 * description: Singleton
 */
public interface Singleton {

    default void doSomething(){
        System.out.println("I'm a singleton instance");
    }
}
