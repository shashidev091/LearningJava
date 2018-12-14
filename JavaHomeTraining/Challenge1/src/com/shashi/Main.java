package com.shashi;

public class Main {

    public static void main(String[] args) {
	    Bank b = new Bank();
	    b.setName("Shashi");
	    b.setAccountBalance(200000.0);
	    b.setCity("Ranchi");
	    b.setCoustomerAdress("Begusarai");
	    b.getAccountBalance();
	    b.Deposites();
	    b.WithdrawlAmmount();
    }
}
