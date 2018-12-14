package com.shashi;

public class Student {
    private String Name;
    private String FName;
    private String MobileNo;
    private String JobDesig;
    private String AccountNo;
    private double Balance;

    Student(String Name,String FName,String MobileNo,String JobDesig,String AccountNo,double Balance){
        this.Name = Name;
        this.FName = FName;
        this.MobileNo = MobileNo;
        this.JobDesig = JobDesig;
        this.AccountNo = AccountNo;
        this.Balance = Balance;
    }
    void display(){
        System.out.println("Account holder name = "+Name);
        System.out.println("Father name = "+FName);
        System.out.println("Mobile no. = "+MobileNo);
        System.out.println("Job Designated = "+JobDesig);
        System.out.println("Account no. = "+AccountNo);
        System.out.println("Available balance = "+Balance);
    }
}
