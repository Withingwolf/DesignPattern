package com.withing.designPattern.decorator;

import org.junit.Test;

public class Client {

    @Test
    public void decoratorTest(){
        Apple apple = new Apple();
        apple.taste();
        System.out.println();
        FruitJuiceDecorator fruitJuiceDecorator = new SaltyFruitJuice(apple);
        fruitJuiceDecorator.taste();
        System.out.println();
        fruitJuiceDecorator = new SaltyFruitJuice(new Peach());
        fruitJuiceDecorator.taste();
    }
}
