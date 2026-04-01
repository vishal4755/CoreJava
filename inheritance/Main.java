package com.tka.inheritance;

public class Main {
	public static void main(String[] args) {
		GoogleMap gmap = new GoogleMap();
		gmap.company();
		gmap.gMap();
		System.out.println("---------------");
		
		GMail mail = new GMail();
		mail.company();
		mail.email();
		System.out.println("---------------");

		GDrive drive = new GDrive();
		drive.company();
		drive.gDrive();
		System.out.println("---------------");

	}

}
