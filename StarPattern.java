package com.tka.star;

public class StarPattern {

	public static void main(String[] args) {

    // 1.
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *
		System.out.println("-------------");
		for(int i = 1 ; i<=5;i++) {
			for(int j = 1; j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("---------------");
    
		// 2.
            *****
            ****
            ***
            **
            *
		for(int i = 1 ; i<=5;i++) {
			for(int j = 5; j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------");

    // 3.
      *
      **
      ***
      ****
      *****
		for(int i = 1 ; i<=5;i++) {
			for(int j =1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------");

    // 4.pyramid pattern
        * 
       * * 
      * * * 
     * * * * 
    * * * * * 
		
		int n = 5;
		for(int i = 1; i<=n;i++) {
			for(int j = 1;j<=n-i;j++) {
				System.out.print(" ");
         }
			for(int k =1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		System.out.println("--------------");
		
		// 5.diamond pattern.
      * 
     * * 
    * * * 
     * * 
      *
		int v = 3;
		// upper part
		for(int i = 1; i<=v;i++) {
			 // spaces
			for(int j = 1;j<=v-i;j++) {
				System.out.print(" ");
				
                  }
		    // stars
			for(int k =1;k<=i;k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		// lower part
			for (int i1 = v - 1; i1 >= 1; i1--) {

	            // spaces
	            for (int j = 1; j <= v - i1; j++) {
	                System.out.print(" ");
	            }

	            // stars
	            for (int k = 1; k <= i1; k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
			}
			
			System.out.println("---------------");
		}

	}


