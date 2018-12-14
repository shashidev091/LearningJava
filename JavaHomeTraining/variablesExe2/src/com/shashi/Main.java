package com.shashi;

public class Main {

    public static void main(String[] args) {
	    int myValue=200;
	    short secondValue = 123;
	    byte thirdValue= 125;
	    int totalValue = myValue + secondValue + thirdValue;
	    int averageOfTheTotal = totalValue/3;
        System.out.println("The total value of the values is: "+totalValue);
        System.out.println("The average of the total value is: "+averageOfTheTotal);
        float pi = 22f/7f;
        System.out.println("The value of pi is: "+pi);
//        Challenge--------------------------------------------------------------------
        int givenNumber = 200;
        float convertedNumber = 0.45359237f * givenNumber;
        System.out.println("The Conversion of the given number of pound in kilograms is: "+convertedNumber);
        char myChar = '\u00AE';
        System.out.println("The registered trade mnark is "+myChar);
    }
}
