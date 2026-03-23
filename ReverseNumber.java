package com.tks.practice;

public class ReverseNumber {
	int num = 1234;
	public void display() {
		int rev = 0;
		while(num!=0) {
			rev = rev * 10 + num % 10;
            num = num / 10;
			
		}
		System.out.println("Reverse Number of 1234 =  " + rev);

	}

}
