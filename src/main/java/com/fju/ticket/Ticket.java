package com.fju.ticket;

public class Ticket {
    Station start;
    Station destination;
    int amount;
    int price;
    public Ticket(Station start,Station destination,int amount,int price){
        this.start=start;
        this.destination=destination;
        this.amount=amount;
        this.price=price;
    }

    public Ticket(Station start, Station destination, int amount) {

    }

    public int price(){
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
        System.out.println("normal ticket"+"\t"+start.name + " to " + destination.name + "\t" + amount + "\t"+ price()*amount);
    }
}
