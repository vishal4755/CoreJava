package com.tka.encapsulation;

public class Bank {

	private double balance;

	public Bank(double balance) {

		this.balance = balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited : " + amount);
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdraw : " + amount);
		} else {
			System.out.println("Insufficient Balance");
		}
	}
}