package com.tka;

public class WeekdayWeekend {

	public static void main(String[] args) {

		// 2. Check Weekday or Weekend
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

		// 1. Check Character Case
				        char ch = 'V';

		        switch (ch) {

		            case 'A': case 'B': case 'C': case 'D': case 'E':
		            case 'F': case 'G': case 'H': case 'I': case 'J':
		            case 'K': case 'L': case 'M': case 'N': case 'O':
		            case 'P': case 'Q': case 'R': case 'S': case 'T':
		            case 'U': case 'V': case 'W': case 'X': case 'Y':
		            case 'Z':
		                System.out.println("Uppercase Character");
		                break;

		            case 'a': case 'b': case 'c': case 'd': case 'e':
		            case 'f': case 'g': case 'h': case 'i': case 'j':
		            case 'k': case 'l': case 'm': case 'n': case 'o':
		            case 'p': case 'q': case 'r': case 's': case 't':
		            case 'u': case 'v': case 'w': case 'x': case 'y':
		            case 'z':
		                System.out.println("Lowercase Character");
		                break;

		            default:
		                System.out.println("Not an alphabet");
		        }

		// 3. Check Arithmetic Operation Name

		int num = 4;
		switch (num) {
		case 1: 
			
		System.out.println("Addition Of Two Number");
		break;
		
		case 2:
			System.out.println("Subtraction of Number");
			break;
		case 3: 
			System.out.println("Multiplication of Number");
			break;
		case 4:
			System.out.println("Division of Number");
			break;
			
			default : 
				System.out.println("Incorrect Input");
		}

		// 4. Fruit Price Menu
				int n1 = 3;
		switch (n1) {
		case 1:
			System.out.println("Apple Price $ 100");
			
			break;
		case 2 :
			System.out.println("Mango Price $ 80");
			break; 
			
		case 3 :
			System.out.println("Banana Price $ 40");
			break;
			
		case 4 :
			System.out.println("Orange Price $ 60");
			break;

		default:
			System.out.println("Invalid Choice");
			break;
		}
      // 5. Language Selection
			String Language = "Marathi";
		switch (Language) {
		case "Marathi":
			System.out.println("Namaskar Mitranno");
			break;

		case "Hindi":
			System.out.println("Namaste India");
            break;
            
		case "English" :
			System.out.println("Hello Friends");

		default:
			System.out.println(" Plzzzzzzzzzzzzz Correct Lng");
			break;
		}

		// 6. Student Result Status
				char grade = 2;
		switch (grade) {
		case 1 :
			System.out.println("Passed With Distinction");
			break;
		case 2 :
			System.out.println("Passed With First Class");
			break;
		case 3 :
			System.out.println("Passed With Second Class");
			break;
		case 4 :
			System.out.println(" You Are Passed");
			break;
		case 5 :
			System.out.println("You Are Fail.....!");
			break;
		default:
			System.out.println(" Choose Correct Choice ");
			break;
		}
		// 7. Season Based on Month
				String month = "Dec=Feb";
		switch (month) {

		case "Dec=Feb":
			System.out.println("This Is Winter Season");
			break;
		case "Mar=May":
			System.out.println("This Is Summer Season");
			break;
		case "Jun=Sep":
			System.out.println("This Is Monsoon Season");
			break;
		case "Oct=Nov":
			System.out.println("This Is Auntumn Season");
			break;
		default:
			System.out.println("Please Correct The Month Choice");
			break;
		}

		// 8. ATM Menu
			int Choice = 3;
		switch (Choice) {
		case 1:
			System.out.println("Check Your Account Balance");
			break;
		case 2:
			System.out.println("Withdraw Your Money");
			break;
		case 3:
			System.out.println("Deposit Money");
			break;
		case 4:
			System.out.println("Exit Transaction");
			break;
		default:
			System.out.println("Please Correct The Choice");
			break;
		}

		// 9. Simple Food Menu
			int choice = 2;
		switch (choice) {
		case 1:
			System.out.println("This Is Pizza");
			break;
		case 2:
			System.out.println("This Is Burger");
			break;
		case 3:
			System.out.println("This Is Sandwitch");
			break;
		case 4:
			System.out.println("This Is Pasta")
			break;
		default:
			System.out.println("Select Correct menu");
			break;
		}
		// 10. Check Digit Name
				int check = 5;
		switch (check) {
		case 0:
			System.out.println("This is Zero");
			break;
		case 1:
			System.out.println("This is Zero");
			break;
		case 2:
			System.out.println("This is Two");
			break;
		case 3:
			System.out.println("This is Three");
			break;
		case 4:
			System.out.println("This is Four");
			break;
		case 5:
			System.out.println("This is Five");
			break;
		case 6:
			System.out.println("This is Six");
			break;
		case 7:
			System.out.println("This is Seven");
			break;
		case 8:
			System.out.println("This is Eight");
			break;
		case 9:
			System.out.println("This is Nine");
			break;
		default:
			System.out.println("select correct one");
			break;
		}
		// 11. Area of Shapes
			float  side = 3.2f, area , side1 = 2.1f;
		float pi = 3.14f;
		int num = 3;
		switch (num) {
		case 1:
			area = side * side;
			System.out.println(" Area Of Square " + area);
			break;
		case 2:
		  area = side * side;
			System.out.println(" Area Of Circle " + area );
			break;
		case 3:
			area = side * side;
			System.out.println(" Area Of Rectangle " + area);
			break;
		default:
			System.out.println(" Invalid Choice ");
			break;
		}

		// 12. Check Number Range
			int number = 10;
		switch (number) {
		case 0,1,2,3:
			System.out.println("This Is Low Number Range");
			break;
		case 4,5,6,7:
			System.out.println("This Is Meddium Number Range");
			break;
		case 8,9,10:
			System.out.println("This Is Low Number Range");
			break;
		default:
			System.out.println("Choose Correct Input");
			break;
		}
		// 13. Company Department 
		    char num =  3;
    switch (num) {
	case 1:
		System.out.println("This Is HR Departmrnt");
		break;
	case 2:
		System.out.println("This Is Finance Departmrnt");
		break;
	case 3:
		System.out.println("This Is IT Departmrnt");
		break;
	case 4 :
		System.out.println("This Is Marketing Departmrnt");
		break;
	default:
		System.out.println("Select Correct Department");
		break;
	}
		// 14. Vehicle Type
			int choice = 2;
		switch (choice) {
		case 1:
			System.out.println("This Is A Bike");
			break;
		case 2:
			System.out.println("This Is A Car");
			break;
		case 3:
			System.out.println("This Is A Bus");
			break;
		case 4:
			System.out.println("This Is A Truck");
			break;
		default:
			System.out.println("Incorrect input");
			break;
		}
		
// 15. Check Password Strength Level
			  int password = 3;
	  switch(password) {
	  case 1 :
	  System.out.println("Weak password");
	  break;
	  case 2 :
		  System.out.println("Medium password");
		  break;
	  case 3 :
		  System.out.println("Strong password");
		  break;
		  default :
			  System.out.println("No Matched.......");
	  
	  }

	}

}

