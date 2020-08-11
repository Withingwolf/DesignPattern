package com.withing.designPattern.bridge;

/**
 * @author huangweixin7
 * @date 2020/8/11 22:32:37
 * description: Human
 */
public abstract class Human {

    private BridgeAction action;

    abstract void soul();

    public void setAction(BridgeAction action) {
        this.action = action;
    }

    public void executeAction() {
        if (action != null) {
            action.executeAction();
        }
    }


}
