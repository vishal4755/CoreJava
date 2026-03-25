package com.tka.method;

public class FibonacciSeries {
//	public void fibonacci(int a ,int b){
//		int num = 10;
//		for(int i = 1;i<=10;i++) {
//			System.out.print(a + ",");
//			 num = a+b;
//			 a = b;
//			 b = num;
//			 
//			
//		}
//		
//	}
//	
	
	public int fibonacci1(int a ,int b){
		int num = 0;

        for(int i = 1; i <= 10; i++) {
            System.out.print(a + ",");
            num = a + b;
            a = b;
            b = num;
        }

        return num;
    }

		
	}



