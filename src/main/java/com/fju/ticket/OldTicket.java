package com.fju.ticket;

public class OldTicket extends StudentTicket {
    float off = 0.5f;

    public OldTicket(Station start, Station destination, int amount) {
        super(start, destination, amount);
    }

    @Override
    public float price() {
        if (start.id == 100 && destination.id == 200 || start.id == 200 && destination.id == 100) {
            return 600 * off;
        } else if (start.id == 200 && destination.id == 300 || start.id == 300 && destination.id == 200) {
            return 900 * off;
        } else if (start.id == 100 && destination.id == 300 || start.id == 300 && destination.id == 100) {
            return 1500 * off;
        }
        return 0;
    }

    public void print() {
        System.out.println("Old Ticket" + "\t" + start.name + "to" + destination.name + "\t" + amount + "\t" + price() * amount);
    }
}

