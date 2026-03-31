package com.tks.ecm;

public class Bank {
	private double balance;
	
	public void initialBal(double balance) {
		System.out.println("InitialBalance :-" + balance);
		
	}
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit :- " + balance);
		
	}
	 public void withdraw(double amount) {
	        if(amount <= balance) {
	            balance = balance - amount;
	            System.out.println("Withdraw Money :- " + amount) ;
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    }

	 public double getBalance() {
	        return balance;
	    }
	}
