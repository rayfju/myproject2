package com.fju.shopping;

public class SilverCustomer extends Customer {
    public SilverCustomer(String name, int price) {
        super(name, price);
    }

    public int discount() {
        if (price > 1000) {
            int dis = price / 1000;
            return price - 100 * dis;
        } else {
            return price;
        }
    }
    public int reduction(){
        if(price>1000){
            return price/1000*100;
        }else {
            return 0;
        }
    }
}
