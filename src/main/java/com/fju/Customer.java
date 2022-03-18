package com.fju;

public  class Customer {
    String name;
    int price;

    public Customer(String name, int price) {
        this.name = name;
        this.price = price;
        if (price > 1000) {
            int dis = price / 1000;
            System.out.println(price - 100 * dis);
        } else {
            System.out.println(price);
        }
    }
}


