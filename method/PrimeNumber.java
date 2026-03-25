package com.tka.method;

public class PrimeNumber {
void check(int num) {

	        int count = 0;

	        for(int i = 1; i <= num; i++) {

	            if(num % i == 0)
	                count++;

	        }

	        if(count == 2)
	            System.out.println("Prime Number");
	        else
	            System.out.println("Not Prime");

	    }
}
	
//	int  check1(int num) {
//		
//
//        int count = 0;
//
//        for(int i = 1; i <= num; i++) {
//
//            if(num % i == 0)
//                count++;
//
//        }
//
//        if(count == 2)
//            System.out.println("Prime Number");
//        else
//            System.out.println("Not Prime");
//        return num;
//    }
	
	
	


