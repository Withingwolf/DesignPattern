package com.withing.designPattern.prototype;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author huangweixin7
 * @date 2020/8/10 22:25:05
 * description: ItemPrototype
 */
public class ItemPrototype {

    private static ConcurrentHashMap<String,Item> itemMap = new ConcurrentHashMap<>();

    public static Item getItem(String itemId){
        Item item = itemMap.get(itemId);
        return (Item) item.clone();
    }

    static {
        Phone phone = new Phone();
        Price phonePrice = new Price();
        phonePrice.setPrice("1000");
        phone.setPrice(phonePrice);
        itemMap.put("1",phone);
        PersonalComputer personalComputer = new PersonalComputer();
        Price computerPrice = new Price();
        computerPrice.setPrice("5000");
        personalComputer.setPrice(computerPrice);
        itemMap.put("2",personalComputer);
    }

}
