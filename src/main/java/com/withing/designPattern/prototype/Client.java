package com.withing.designPattern.prototype;

import org.junit.Test;

/**
 * @author huangweixin7
 * @date 2020/8/10 22:23:06
 * description: Client
 */
public class Client {

    @Test
    public void testPrototype() {
        Item phone = ItemPrototype.getItem("1");
        phone.print();

        Item computer = ItemPrototype.getItem("2");
        computer.print();

        phone.setRealPrice("200");
        Item phone2 = ItemPrototype.getItem("1");
        phone2.print();
    }
}
