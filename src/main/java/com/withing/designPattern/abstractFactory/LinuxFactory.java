package com.withing.designPattern.abstractFactory;

public class LinuxFactory extends AbstractFactory {
    @Override
    public Windows getWindows() {
        return new LinuxWindows();
    }

    @Override
    public Font getFont() {
        return new LinuxFont();
    }
}
