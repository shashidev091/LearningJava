package com.shashi;

import java.util.Scanner;

public class Bank {
    private String Name;
    private String CoustomerAdress;
    private String City;
    private double AccountBalance;
    private double Deposite;
    private double Withdrawl;

    public void setName(String Name){
        this.Name = Name;
    }
    public void setCoustomerAdress(String CustomerAddress){
        this.CoustomerAdress = CustomerAddress;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public void setAccountBalance(double accountBalance) {
        this.AccountBalance = accountBalance;
    }

    public String getName() {
        return Name;
    }
    public String getCoustomerAdress(){
        return CoustomerAdress;
    }

    public String getCity() {
        return City;
    }

    public void Deposites(){
        System.out.println("Enter the deposite amount");
        Scanner s = new Scanner(System.in);
        Deposite = s.nextDouble();
        DepositeAmount();
    }

    public double getAccountBalance() {
        return AccountBalance;
    }
    public void DepositeAmount(){
        AccountBalance = Deposite + AccountBalance;
        System.out.println("Amount Credited is "+Deposite+" and remaining balance is "+AccountBalance);
    }
    public void WithdrawlAmmount(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the withdrawl amount :");
        Withdrawl = s.nextDouble();
        if(Withdrawl>= AccountBalance){
            System.out.println("Insufficient Balance");
        }
        else{
            AccountBalance = AccountBalance - Withdrawl;
            display();
        }

    }
    void display(){
        System.out.println("Name : "+getName());
        System.out.println("Address : "+getCoustomerAdress()+" "+"City : "+" "+getCity());
        System.out.println("Account BAlance : "+getAccountBalance());
        System.out.println("Amount debited is : "+Withdrawl+" and updated balance is : "+AccountBalance);
    }

}
