package com.shashi;

public class Main {

    public static void main(String[] args) {
        Address a = new Address("Ranchi","College Road","Gumla","Jharkhand",835208);
        Sample1 s = new Sample1(1001,"Shashi",a,2022200,328222);
        s.display();
        s.deposite(45400);
        s.deposite(45400);
    }
}
