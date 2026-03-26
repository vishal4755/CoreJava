package com.tka.constructor;

public class Main {
	public static void main(String[] args) {
		Portfolio p1 = new Portfolio("Vishal", "Tipe", "B.Tech", "Java Developer", "Solapur", 22, "vishal@gmail.com", 95);
		
	   System.out.println("-------------------");
	
		Car c1 = new Car("Black", "BMW", 3000, "Diesel", 15, 123456, "Automatic", 6, 250);
		System.out.println("-------------");
		c1.modelyear = 2020;
		c1.gears = 6;
		c1.display();
		
		System.out.println("-------------");
		
		Employee e1 = new Employee("Karan", "karan@gmail.com");
		e1.city="Pune";
		e1.empId =101;
		e1.moblieNo = 7887775755l;
		e1.calculateBonus();
		
		System.out.println("---------------");
		
		Student s = new Student(45, "Suhas", "Kadam", 25, "Male", "suhas@gmail.com", 1234567890l, "Songola", "b.Tech", "CSE", 8);
		
	}

}
