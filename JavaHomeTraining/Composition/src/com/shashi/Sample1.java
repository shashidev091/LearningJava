package com.shashi;

public class Sample1 {
    int a;
    int b;
    Sample1(int aa,int bb){
        a = aa;
        b = bb;
    }
    boolean isEqual(Sample1 s3){
        if (this.a == s3.a && this.b == s3.b)
            return true;
        else
            return false;

    }
}
