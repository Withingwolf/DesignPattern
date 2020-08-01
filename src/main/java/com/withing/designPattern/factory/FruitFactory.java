package com.withing.designPattern.factory;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.Optional;

public class FruitFactory {

    @Test
    public void testFactory() {
        Fruit fruit = FruitFactory.getFruit("apple");
        Optional.ofNullable(fruit).ifPresent(Fruit::taste);
        fruit = FruitFactory.getFruit("orange");
        Optional.ofNullable(fruit).ifPresent(Fruit::taste);
        fruit = FruitFactory.getFruit("peach");
        Optional.ofNullable(fruit).ifPresent(Fruit::taste);
    }

    public static Fruit getFruit(String fruitName) {
        if ("apple".equals(fruitName)) {
            return new Apple();
        } else if ("orange".equals(fruitName)) {
            return new Orange();
        } else if ("peach".equals(fruitName)) {
            return new Peach();
        }
        return null;
    }


}
