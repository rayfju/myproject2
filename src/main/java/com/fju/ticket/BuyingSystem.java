package com.fju.ticket;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class BuyingSystem {
    public static void main(String[] args) {
        ArrayList<Ticket> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station?(1.Taipei 2.Taichung 3.Kaohsiung)");
        int choice = Integer.parseInt(scanner.next());
        Station begin = null;
        switch (choice) {
            case 1:
                begin = Station.TaipeiStation;
                break;
            case 2:
                begin = Station.TaichungStation;
                break;
            case 3:
                begin = Station.KaohsiungStation;
                break;
        }
        System.out.println("Your destination station?(1.Taipei 2.Taichung 3.Kaohsiung)");
        Station destination = null;
        int choice1 = Integer.parseInt(scanner.next());
        switch (choice1) {
            case 1:
                destination = Station.TaipeiStation;
                break;
            case 2:
                destination = Station.TaichungStation;
                break;
            case 3:
                destination = Station.KaohsiungStation;
                break;
        }
        System.out.println("What kind of ticket?(1.Normal Ticket 2.Student Ticket 3.Old Ticket 4.Return Ticket) ");
        int choice2 = Integer.parseInt(scanner.next());
        int n = Integer.parseInt(scanner.next());
        switch (choice2) {
            case 1:
                Ticket ticket = new Ticket(begin, destination, n);
                list.add(ticket);
                break;
            case 2:
                StudentTicket studentTicket = new StudentTicket(begin, destination, n);
                list.add(studentTicket);
                break;
            case 3:
                OldTicket elderTicket = new OldTicket(begin, destination, n);
                list.add(elderTicket);
                break;
            case 4:
                ReturnTicket returnTicket = new ReturnTicket(begin, destination, n);
                list.add(returnTicket);
        }
        for (Ticket t : list) {
            t.print();
        }
    }
}

