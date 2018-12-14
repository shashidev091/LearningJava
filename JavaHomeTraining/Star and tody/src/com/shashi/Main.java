package com.shashi;

public class Main {

    public static void main(String[] args) {
//        Straight increment
        for(int s=1;s<=5;s++){
            for(int t=1;t<=s;t++){
                System.out.print("*");
            }
            System.out.println();
        }
//            decrement order
	    for(int i=1;i<=5;i++){
	        for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
//        Creating triangle
        System.out.println("Creating Triangle");
        for(int i=1;i<=6;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            for (int l=2;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println();

        System.out.println("***************End of Triangle***********************************************");
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;i--) {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                    System.out.print("*");
                }
            System.out.println();
        }

    }
}
