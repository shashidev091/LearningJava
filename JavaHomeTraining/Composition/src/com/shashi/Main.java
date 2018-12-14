package com.shashi;

public class Main {

    public static void main(String[] args) {
        Sample1 s = new Sample1(4,4);
        Sample1 s1 = new Sample1(2,8);
        if(s.isEqual(s1)){
            System.out.println("Both are equal");
        }else{
            System.out.println("Not equal");
        }
    }
}
