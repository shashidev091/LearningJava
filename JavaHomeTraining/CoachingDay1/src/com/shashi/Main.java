package com.shashi;

public class Main {

    public static void main(String[] args) {
	int a=10;
	int b = 20;
        System.out.println(a+b);
        char inputData = '&';
        if(inputData>='a' && inputData>='Z'){
            System.out.println("The input is char");
        }
        else if(inputData>='0' && inputData<='9'){
            System.out.println("The entered input is digits/numbers");
        }
        else{
            System.out.println("It is a special charcter");
        }
//        Switch case problems

        char inputdata = 'M';
        switch (inputdata){
            case 'f':
            case 'F':
                System.out.println("Female");
                break;
            case 'm':
            case 'M':
                System.out.println("Male");
                break;
                default:
                    System.out.println("Wrong Input");
                    break;
        }

//        Day finder

        int day = 39;
        String dayString;
        switch (day){
            case 1:
                dayString = "Sunday";
                System.out.println(dayString);
                break;
            case 2:
                dayString = "Monday";
                System.out.println(dayString);
                break;
            case 3:
                dayString = "Tuesday";
                System.out.println(dayString);
                break;
            case 4:
                dayString = "Wednesday";
                System.out.println(dayString);
                break;
            case 5:
                dayString= "Thrusday";
                System.out.println(dayString);
                break;
            case 6:
                dayString = "Friday";
                System.out.println(dayString);
                break;
            case 7:
                dayString = "Saturday";
                System.out.println(dayString);
                break;
            default:
                System.out.println("Invalid input, Since There are only saven days you fool");
                break;
        }
//        For loop for factorial
        int givenData = 5;
        int fact=1;
        for (int i=1;i<=givenData;i++){
             fact = fact*i;
        }
        System.out.println(fact);
    }
}
