package com.tka.method;

public class Main {

	public static void main(String[] args) {
		FibonacciSeries fb = new FibonacciSeries();
		fb.fibonacci1(0, 1);
		System.out.println("----------------");
		System.out.println();
		
		
		FibonacciSeries fs = new FibonacciSeries();
		System.out.println(fs.fibonacci1(0, 1));
		System.out.println("-------------");

		PrimeNumber p1 = new PrimeNumber();
		p1.check(45);
		System.out.println("------------");
		
		ReverseNo r1 = new ReverseNo();
		r1.display(123456);
		System.out.println("--------------");
		
		PalindromeNo no = new PalindromeNo();
		no.palindrome(121);
		System.out.println("--------------");
		
		EvenOddNo  e1 = new EvenOddNo();
		e1.number(55);
		System.out.println("-------------");
	}

}
