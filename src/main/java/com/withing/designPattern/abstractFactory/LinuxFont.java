package com.withing.designPattern.abstractFactory;

public class LinuxFont implements Font {
    @Override
    public void drawFont() {
        System.out.println("Linux 字体");
    }
}
