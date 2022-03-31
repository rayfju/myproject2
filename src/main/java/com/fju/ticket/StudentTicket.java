package com.fju.ticket;

public class StudentTicket extends Ticket{
    float off =0.8f;
    public StudentTicket(Station start,Station destination,int amount){
        super(start,destination,amount);
    }
}
