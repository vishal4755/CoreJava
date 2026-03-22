package com.practice;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number = 545;
		int reverseNumber = 0;
		int temp = number;
		while(temp>0) {
			int reminder = temp%10;
			reverseNumber = reverseNumber *10 + reminder;
			temp = temp/10;
			
		}
		if(number == reverseNumber) {
			System.out.println("This Is Palindrome Number  " );
		}else {
			System.out.println("This Is Not Palindrome Number  " );
		}
		
		
	}

}
