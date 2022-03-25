package com.fju.shopping;

public class Shopping {
    public static void main(String[] args) {
        Customer normal= new Customer("0001",1200);
        System.out.println(normal.name+"\t"+normal.price);
        SilverCustomer S1=new SilverCustomer("0002",800);
        System.out.println(S1.name+"\t"+S1.price+"\t"+ S1.reduction());
        GoldenCustomer G1=new GoldenCustomer("0003",2000);
        System.out.println(G1.name+"\t"+G1.price+"\t"+G1.reduction());

    }
}
