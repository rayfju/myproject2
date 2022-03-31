package com.fju.ticket;

public class Station {
    public static final Station TaipeiStation=new Station(100,"Taipei");
    public static final Station TaichungStation=new Station(200,"Taichung");
    public static final Station KaohsiungStation=new Station(300,"Kaohsiung");
    int id;
    String name;
    public Station(int id,String name){
        this.id=id;
        this.name=name;
    }
}
