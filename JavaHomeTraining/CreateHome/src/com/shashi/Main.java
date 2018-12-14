package com.shashi;
import java.util.*;
public class Main {

    public static void main(String[] args) {
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
        for(int s=1;s<=6;s++)
        {
            for(int t=1;t<=s;t++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int u = 6;u>=1;u--)
        {
            for (int v=2;v<=u;v++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Comments" +s);
        System.out.println("The user nam is"+s);

    }
}
