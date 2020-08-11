package com.withing.designPattern.bridge;

/**
 * @author huangweixin7
 * @date 2020/8/11 22:35:13
 * description: WalkAction
 */
public class WalkAction implements BridgeAction {
    @Override
    public void executeAction() {
        System.out.println("I'm walking");
    }
}
