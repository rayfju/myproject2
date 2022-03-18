package com.fju;

public class Shopping {
    public static void main(String[] args) {
        Customer normal= new Customer("0001",1200);
        System.out.println(normal.name+"\t"+normal.price);
        Customer two=new Customer("0002",800);
        System.out.println(two.name+"\t"+two.price);
        SilverCustomer S1=new SilverCustomer("0003",2000);
        System.out.println(S1.name+"\t"+S1.price+"\t"+ S1.reduction());
    }
}
