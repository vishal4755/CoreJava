package com.tka.constructor;

public class Car {
	int modelyear;
	int gears; 
	
	public Car(String color,String model,int engineCC, String fuelType,int milage,double price,String transmission,int seatingCapacity,int topSpeed) {
		System.out.println("********* Car Details *******");
		System.out.println("Car Color :- " + color );
		System.out.println("Car model :- " + model);
		System.out.println("Car EngineCC :- " + engineCC + "cc");
		System.out.println("Car FuelType :- " + fuelType );
		System.out.println("Car Milage :- " + milage );
		System.out.println("Car Price :- " + price );
		System.out.println("Car Transmission :- " + transmission );
		System.out.println("Car SeatingCapacity :- " + seatingCapacity );
		System.out.println("Car TopSpeed :- " + topSpeed);
	
				
	}
	void display() {
		System.out.println("Modelyear = " + modelyear);
		System.out.println("Gears = " + gears);
		
	}

}
