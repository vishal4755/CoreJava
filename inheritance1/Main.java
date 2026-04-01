package com.tka.inheritance1;

public class Main {

	public static void main(String[] args) {
		CurrentAccount ca = new CurrentAccount();
		ca.bankName();
		ca.current();
		System.out.println("----------");
		SavingAccount sa = new SavingAccount();
		sa.bankName();
		sa.saving();
		System.out.println("--------------------");
	}

}
