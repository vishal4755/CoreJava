package com.collection;
import java.util.*;
public class ReverseArray {


	
	    public static void main(String[] args) {
	        ArrayList<Integer> list = new ArrayList<>();

	        list.add(45);
	        list.add(79);
	        list.add(32);
	        list.add(9);
	        list.add(99);
	        list.add(24);

	        Collections.reverse(list);

	        System.out.println(list);
	    }
	}
