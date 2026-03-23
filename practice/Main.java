package com.tks.practice;

public class Main {

	public static void main(String[] args) {

		FibonacciSeries obj = new FibonacciSeries();
		obj.Display();
		System.out.println("----------------");

		EvenOddNumber e1 = new EvenOddNumber();
		e1.show();
		System.out.println("----------------");

		ReverseNumber rev = new ReverseNumber();
		rev.display();
		System.out.println("---------------");

		Palindrome obj1 = new Palindrome();
		obj1.check();

		System.out.println("---------------");

		PrimeNumber p1 = new PrimeNumber();
		p1.checkPrime();

	}

}
