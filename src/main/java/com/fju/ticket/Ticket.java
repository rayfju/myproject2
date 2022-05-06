package com.fju.ticket;

public class Ticket {
    Station start;
    Station destination;
    int amount;
    float price;
    public Ticket(Station start,Station destination){
        this.start=start;
        this.destination=destination;
        int diff=Math.abs(start.id- destination.id);
        System.out.printf("diff:"+diff);
        switch (diff){
            case 100:
                price=500;
                break;
            case 200:
                price=600;
                break;
            case 300:
                price=1100;
                break;
        }
    }
    /*public Ticket(Station start,Station destination,int amount){
        this.start=start;
        this.destination=destination;
        this.amount=amount;
    }*/
    public float price(){
        if(start.id==100&&destination.id==200||start.id==200&&destination.id==100){
            return 600;
        }else if(start.id==200&&destination.id==300||start.id==300&&destination.id==200) {
            return 900;
        }else if(start.id==100&&destination.id==300||start.id==300&&destination.id==100){
            return 1500;
        }
        return 0;
    }

    public void print(){
        System.out.println("normal ticket"+"\t"+start.name + " to " + destination.name + "\t" + amount + "\t"+  price()*amount);
    }
}
