package com.tka.encapsulation;

public class Main {
public static void main(String[] args) {
	Student s = new Student();
	System.out.println();
	System.out.println("********  Student Info... *******");
	s.setAge(22);
	s.setName("Vishal Tipe");
	s.setEmail("vishal@gmail.com");
	System.out.println( "Student Age :- " + s.getAge());
	System.out.println("Student Name :- " +s.getName());
	System.out.println("Student Email :- " +s.getEmail());
	
	System.out.println("-------------------------------------------------");
	System.out.println();
	
	Bank b = new Bank(25000);
	System.out.println(" ******** Bank Account History ********");
	System.out.println( "Initiaal Balance :- " + b.getBalance());
	b.deposit(50000);
	b.withdraw(10000);
	System.out.println("Remaining Balance :- " + b.getBalance());
	
}
}
