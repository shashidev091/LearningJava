package com.shashi;

public class Main {

    public static void main(String[] args) {
	    int myFirst_variable = 10;
	    char firstString = 'a';
	    char secondString ='\u00A9';
	    String thirdString = " This is a registered trademark symbol";
        System.out.println(firstString+thirdString+" and "+ secondString+" "+myFirst_variable);
		System.out.println(secondString);
		int result = (myFirst_variable * 200);
		System.out.println(result);
		int previousResult = result;
		result = result * 20;
		System.out.println("The new modified result is "  + result);
		System.out.println("Its the next p "+result*10);
		System.out.println(previousResult);
		if(result>=50000){
			System.out.println("The result output is less than 50000");
		}
		else if(result<=50000){
			System.out.println("Output is greater than 50000");
		}
		else{
			System.out.println("Everything is a waste");
		}

    }
}
