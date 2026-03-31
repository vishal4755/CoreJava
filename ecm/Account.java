package com.tks.ecm;

public class Account {
	private double balance;


    Account(double balance) {
    	System.out.println("initial Balance :- "+ balance);
        this.balance = balance;
    }


    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }


    double getBalance() {
        return balance;
}
}
