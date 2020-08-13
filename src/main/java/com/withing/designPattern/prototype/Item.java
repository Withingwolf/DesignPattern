package com.withing.designPattern.prototype;

/**
 * @author huangweixin7
 * @date 2020/8/10 22:18:41
 * description: Ware
 */
public abstract class Item implements Cloneable {

    protected Price price;

    abstract void print();

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public void setRealPrice(String price) {
        this.price.setPrice(price);
    }

    @Override
    @SuppressWarnings("all")
    protected Object clone() {
        Object object = null;
        try {
            Item item = (Item) super.clone();
            item.setPrice((Price) item.price.clone());
            object = item;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }
}
