package com.shashi;

public class Main {

    public static void main(String[] args) {
	    for(int i=1;i<=5;i++){
	        for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        for(int a=6;a>=1;a--){
	        for (int b=1;b<=a;b++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i= 1;i<=6;i++){
	        for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++){
                System.out.print("*");
            }
            for(int l =2;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
