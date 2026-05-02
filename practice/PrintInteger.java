package com.practice;

import java.util.ArrayList;

public class PrintInteger {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		System.out.print("ArrayList :- ");
		for (Integer print : list) {
			System.out.print(print + " ");
		}
		System.out.println();
		System.out.println("-------------");
		// Remove Specific Element
		ArrayList<String> l = new ArrayList<String>();
		l.add("JDBC");
		l.add("Spring Boot");
		l.add("Servlet");
		l.add("Java");
		l.add("Python");
		
		
		System.out.println("Not Updated Array :- " + l);
		l.remove("Servlet");
		System.out.println("Updated Array :- " + l);
	}

}
