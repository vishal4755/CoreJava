package com.tka.method;

public class ReverseNo {
	public void display(int num) {
		int rev = 0;
		while(num!=0) {
			rev = rev * 10 + num % 10;
            num = num / 10;
			
		}
		System.out.println("Reverse Number of 1234 =  " + rev);

	}

}
