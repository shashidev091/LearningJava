package com.shashi;

public class Sample1 {
    private int EmpId;
    private String EmpName;
    private double salary;
    private double AccountBalance;
    private Address Add;
    void deposite(double credit){
        AccountBalance = credit + AccountBalance;
        System.out.println("New balance is : "+AccountBalance);
    }

    Sample1(int EmpId,String EmpName,Address Add,double salary,double AccountBalance){
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.Add = Add;
        this.salary = salary;
        this.AccountBalance= AccountBalance;
    }
    void display(){
        System.out.println("Employee ID : "+EmpId);
        System.out.println("Employee Name : "+EmpName);
        System.out.println("Salary of the Employee : "+salary);
        System.out.println("Account Banlance : "+AccountBalance);
        System.out.println("City : "+Add.City);
        System.out.println("Street : " +Add.Street);
        System.out.println("District : "+Add.District);
        System.out.println(" Pin Code : "+Add.pincode);
        System.out.println("State : "+Add.State);
            }
}
