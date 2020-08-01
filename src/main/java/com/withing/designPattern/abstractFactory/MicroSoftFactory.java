package com.withing.designPattern.abstractFactory;

public class MicroSoftFactory extends AbstractFactory{
    @Override
    public Windows getWindows() {
        return new MicrosoftWindows();
    }

    @Override
    public Font getFont() {
        return new MicrosoftFont();
    }
}
