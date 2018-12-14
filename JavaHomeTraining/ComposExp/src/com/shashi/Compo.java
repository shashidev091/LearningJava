package com.shashi;

public class Compo {
    int marks[] = {454,67,767,767,55};
    String Names[] = {"Shashi","Bhushan","Bhagat"};
    void calculateTotal(){
        int totalmarks = 0;
        for(int i=0;i<marks.length;i++){
            totalmarks += marks[i];
        }
        System.out.println("The total marks is "+totalmarks);
    }
}