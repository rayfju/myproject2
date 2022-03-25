package com.fju.shopping;

public  class Customer {
    String name;
    int price;
    float off;
    public Customer(String name, int price) {
        this.name = name;
        this.price = price;
        if (price > 1000) {
            int dis = price / 1000;
            System.out.println(price - 100 * dis+off);
        } else {
            System.out.println(price+off);
        }
    }
}


