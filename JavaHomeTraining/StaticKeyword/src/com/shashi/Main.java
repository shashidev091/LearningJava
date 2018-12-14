package com.shashi;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Student s = new Student("Shashi Bhushan Bhagat","Sukhdas Bhagat","9931920057","Software Engineer","32822956486",2000000);
        s.display();
        System.out.println("********************************************");
        Student s1 = new Student("Saurav Singh","Mukund Kr. Singh","8144949280","Cashier","5432187652",400000000);
        s1.display();
        System.out.println("*************************************************************************");
        Student s3 = new Student("Rabita Lakra","Anand Oraon","834029908","House Wife","45766224554",5000.22);
        s3.display();
        System.out.println("***********************************************************************************");
        Student s4 = new Student("Rushika VijayKumar Tiwari","VijayKumar Tiwari","9600045833","Associate Testing","46545852241",454000);
        s4.display();
        System.out.println("*****************************************************************************************");
        Student s5 = new Student("Shankar Kumar Gupta","Dont know","8072964214","Tecnical Engineer","5478542165",578522.0);
        s5.display();
        Scanner b = new Scanner(System.in);
        String name;
        System.out.println("Enter Desired Name ");
        name = b.next();
        System.out.println("you are  "+name);
    }
}
