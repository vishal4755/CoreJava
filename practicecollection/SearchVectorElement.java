package com.practicecollection;
import java.util.Vector;

public class SearchVectorElement {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Vishal");
		v.add("Nishant");
		v.add("Karuna");
		v.add("]Shrusti");
		v.add("Vaishnavi");
	
		String SearchElement = "Vishal";
	
		if(v.contains(SearchElement)) {
			System.out.println("Exists In Vector :- " + SearchElement);
		}else {
			System.out.println(" not Exists In Vector :- " + SearchElement);
		}

	}

}
