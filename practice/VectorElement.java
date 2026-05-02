package com.practice;

import java.util.Vector;

public class VectorElement {

	public static void main(String[] args) {
		Vector<Integer> list = new Vector<Integer>();
		list.add(55);
		list.add(34);
		list.add(76);
		list.add(98);
		list.add(13);
      
		
		System.out.print("Vector List :- ");
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}


	}

}
