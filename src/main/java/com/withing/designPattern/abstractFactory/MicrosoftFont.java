package com.withing.designPattern.abstractFactory;

public class MicrosoftFont implements Font {
    @Override
    public void drawFont() {
        System.out.println("microsoft 字体");
    }
}
