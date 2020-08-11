package com.withing.designPattern.bridge;

import org.junit.Test;

/**
 * @author huangweixin7
 * @date 2020/8/11 22:38:00
 * description: ClientDemo
 */
public class ClientDemo {
    @Test
    public void humanTest(){
        Human human = new Me();
        BridgeAction action = new ThinkAction();
        human.setAction(action);
        human.soul();
        human.executeAction();

        action = new WalkAction();
        human.setAction(action);
        human.soul();
        human.executeAction();

    }
}
