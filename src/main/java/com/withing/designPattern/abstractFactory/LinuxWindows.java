package com.withing.designPattern.abstractFactory;

public class LinuxWindows implements Windows {
    @Override
    public void showWindows() {
        System.out.println("Linux 窗口");
    }
}
