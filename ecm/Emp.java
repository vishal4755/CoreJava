package com.tks.ecm;

public class Emp {
	 private String name;
	    private double salary;

	  
	    Emp(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	 
	    void increment() {
	        salary = salary + (salary * 10 / 100);
	    }

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Final Salary: " + salary);
	    }


}
