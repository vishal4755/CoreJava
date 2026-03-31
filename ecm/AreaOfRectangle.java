package com.tks.ecm;

public class AreaOfRectangle {
	int length;
	int width;
	public AreaOfRectangle(int length, int width) {

		this.length = length;
		this.width = width;
	}
	void area(){
		int Area = length*width;
		System.out.println("Area Of Rectangle :-" + Area);
	}

}
