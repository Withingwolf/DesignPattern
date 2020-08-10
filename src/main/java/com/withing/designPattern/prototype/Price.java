package com.withing.designPattern.prototype;

/**
 * @author huangweixin7
 * @date 2020/8/10 22:18:58
 * description: Price
 */
public class Price implements Cloneable{
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    protected Object clone()  {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
