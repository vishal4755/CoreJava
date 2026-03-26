package com.tka.constructor;

public class Employee {
	int empId;
	String city;
	long moblieNo;
	public Employee(String name , String email) {
		

	        System.out.println("***** Employee Details *****");
	        System.out.println("Employee Name: " + name);
	        System.out.println("Salary: " + email);
	    }

	    void calculateBonus() {
	    	double salary = 45000;
	        double bonus = salary + 5000;
	        System.out.println("Salary with Bonus: " + bonus);
	    }
	}


