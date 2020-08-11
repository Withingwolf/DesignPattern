package com.withing.designPattern.bridge;

/**
 * @author huangweixin7
 * @date 2020/8/11 22:36:36
 * description: ThinkAction
 */
public class ThinkAction implements BridgeAction {
    @Override
    public void executeAction() {
        System.out.println("I'm thinking");
    }
}
