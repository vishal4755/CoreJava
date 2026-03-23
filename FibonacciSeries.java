package com.tks.practice;

public class FibonacciSeries {
	int num = 10;

	public void Display() {
		int a = 0, b = 1, c;
		for (int i = 0; i <= 10; i++) {
			System.out.print(a + ",");
			c = a + b;
			a = b;
			b = c;

		}
	}

}
