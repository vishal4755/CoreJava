package com.tks.ecm;

public class CopyConstructor {
	String name;
	int age;
	public CopyConstructor(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public CopyConstructor(CopyConstructor c) {
		name = c.name;
		age = c.age;
	}
	void display() {
		System.out.println("My name :- " + name);
		System.out.println("My Age :- " + age);
	}

}
