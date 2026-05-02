package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	list.add(24);
	list.add(56);
	list.add(55);
	list.add(22);
	list.add(78);
	
	System.out.println(list);
	list.remove(1);
	System.out.println(list);
	list.set(1, 45);
	System.out.println(list);
	
	System.out.println("Size :- " + list.size());
	System.out.println("First Element ;- " + list.get(0));
	System.out.println("Last Element :- " + list.get(list.size()-1));
	
	System.out.println("----------");
	
	   List<String> list1 = Arrays.asList("A","B","C");

       System.out.println(list1.contains("B"));
	
	
	}

}
