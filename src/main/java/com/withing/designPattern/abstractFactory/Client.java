package com.withing.designPattern.abstractFactory;

import org.junit.Test;

import java.util.Optional;

public class Client {

    @Test
    public void create() {
        Optional<AbstractFactory> factory = Optional.ofNullable(SystemFactory.getSystemFactory("Microsoft"));
        Optional<Font> font = factory.map(AbstractFactory::getFont);
        Optional<Windows> windows = factory.map(AbstractFactory::getWindows);
        font.ifPresent(Font::drawFont);
        windows.ifPresent(Windows::showWindows);

        factory = Optional.ofNullable(SystemFactory.getSystemFactory("Linux"));
        font = factory.map(AbstractFactory::getFont);
        windows = factory.map(AbstractFactory::getWindows);
        font.ifPresent(Font::drawFont);
        windows.ifPresent(Windows::showWindows);
    }


}
