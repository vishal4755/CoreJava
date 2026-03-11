package com.tka;

public class WeekdayWeekend {

	public static void main(String[] args) {
		 int day = 7;
	       switch(day) {
	       
	       case 1:
	       case 2:
	       case 3:
	       case 4:
	       case 5:
	   
	          System.out.println("This is WeekDay");
	          break;
	          
	       case 6:
	       case 7:
	    	   System.out.println("This is WeekEnd");
	    	   break;
	    	   
	    	   default: 
	    		   System.out.println("Invalid Input");
	       }

	}

}
