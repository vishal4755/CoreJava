package com.practice;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
	
		
	
		for(int num =1;num<=50;num++) {
			int count = 0;

		for(int i = 1;i<=50;i++) {
			if(num%i==0) {
				count++;
			}
		}
		
         if(count ==2) {
        	 System.out.println(num + " = "+ " Prime Number");
         }else {
        	 System.out.println(num + " = "+ " Not Prime Number");
         }
		
	}
		
	System.out.println("------------------------");

		

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int n = sc.nextInt();

		        for (int num = 1; num <= n; num++) {

		            int count = 0;

		            for (int i = 1; i <= num; i++) {
		                if (num % i == 0) {
		                    count++;
		                }
		            }

		            if (count == 2) {
		                System.out.print(num + " ");
		            }
		        }

		        sc.close();
	}
	}












