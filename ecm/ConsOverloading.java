package com.tks.ecm;

public class ConsOverloading {
	int age;
	ConsOverloading(){
		int age = 22;
		
	}
ConsOverloading(int age){
		this.age = age;
		
	}
void display() {
	System.out.println("Your Age :- " + age);
}
void display1() {
	System.out.println("My Age :- " + age);
}
}
