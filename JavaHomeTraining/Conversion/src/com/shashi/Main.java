package com.shashi;

public class Main {

    public static void main(String[] args) {
//      **********************************  Conversion  **************************************
        String a = "12345";
        float b = 343.3f;
        int c = 32323;
        System.out.println(a);
        float d = Float.parseFloat(a);
        System.out.println(d+c);
        double f = 348535.34;
        double g = Double.parseDouble(a);
        System.out.println(g);
        System.out.println(f+b);
        String h = Float.toString(b);
        System.out.println(h+b);
        String i = Double.toString(g);
        System.out.println(i);
        char j ='A';
        j++;
        System.out.println((int)j);
        char k = 'A';
        char l = 'B';
        char m = 'a';
        char n = 'b';
        System.out.println("A= "+(int)k+" B = "+(int)l+" a = "+(int)m+" b = "+(int)n);
        byte o;
        int p = 256;
        o = (byte)p;
        System.out.println(o);
        double q = 323.142;
        o = (byte)q;
        System.out.println(o);
    }
}
