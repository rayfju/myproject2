package com.fju;

public class Scoring {
    public static void main(String[] args) {
        Student ivan = new Student("ivan",70,88);
        Student fxxk = new Student("fxxk",100,98);
        GraduateStudent jane = new GraduateStudent("Jane",78,80,77);
        ivan.print();
        fxxk.print();
        jane.print();
    }
}
