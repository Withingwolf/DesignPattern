package com.withing.designPattern.adapter;

/**
 * @author huangweixin7
 * @date 2020/8/10 22:53:51
 * description: CameraMemory
 */
public class CameraMemory implements MediaInterface {
    @Override
    public String readMedia() {
        return "camera memory";
    }
}
