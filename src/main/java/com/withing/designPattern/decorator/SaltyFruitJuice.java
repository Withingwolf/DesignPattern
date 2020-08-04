package com.withing.designPattern.decorator;

public class SaltyFruitJuice extends FruitJuiceDecorator {

    SaltyFruitJuice(Fruit fruit){
        this.fruit = fruit;
    }

    private void cook(){
        System.out.println("make "+fruit.getClass().getSimpleName()+" to juice and add salt");
    }

    @Override
    public void taste() {
        cook();
        fruit.taste();
    }
}
