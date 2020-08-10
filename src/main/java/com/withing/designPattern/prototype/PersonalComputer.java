package com.withing.designPattern.prototype;

/**
 * @author huangweixin7
 * @date 2020/8/10 22:22:10
 * description: PersonalComputer
 */
public class PersonalComputer extends Item {

    @Override
    void print() {
        System.out.println("I'm a personal computer,price:"+price.getPrice());
    }

}
