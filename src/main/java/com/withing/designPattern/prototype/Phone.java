package com.withing.designPattern.prototype;

/**
 * @author huangweixin7
 * @date 2020/8/10 22:20:14
 * description: Phone
 */
public class Phone extends Item {

    @Override
    void print() {
        System.out.println("I'm a Phone，price ：" + price.getPrice());
    }
}
