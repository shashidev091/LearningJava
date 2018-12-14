package com.bhushan;

public class Main {
    static void arrayMethod9(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    static int[] get(){
        return new int[]{4545,782,648,3,11,001};
    }
    public static void main(String[] args) {
        arrayMethod9(new int[]{23,3,43,44,56,74,26});
        int arry[]=get();
        int total;
        for (int i = 0;i<arry.length ; i++){
            System.out.println(arry[i]);
        }
    }
}
