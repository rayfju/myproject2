package com.fju.shopping;

public class GoldenCustomer extends SilverCustomer {
    public GoldenCustomer(String name,int price){
        super(name, price);
        off=0.2f;
    }
}
