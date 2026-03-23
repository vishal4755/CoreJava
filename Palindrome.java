package com.tks.practice;

public class Palindrome {
	

	    int num = 12121;   // global variable

	    void check() {

	        int original = num;
	        int rev = 0;

	        while(num != 0) {
	            rev = rev * 10 + num % 10;
	            num = num / 10;
	        }

	        if(original == rev)
	            System.out.println("This Is Palindrome Number");
	        else
	            System.out.println(" This Is Not Palindrome");

	    }

	   
	}


