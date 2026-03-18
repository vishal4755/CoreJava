// 1. Laptop Class
package com.tka.classandobject;
public class Laptop {
	String brand;
	int ram;
}
// 2. Employee Class
package com.tka.classandobject;
public class Employee {
	int id;
	String name;
	float salary;
}
// 3. Car Class
package com.tka.classandobject;
public class Car {
	String model;
	int price;
	String color;
}
// 4. Book Class
package com.tka.classandobject;
public class Book {
	String title;
	String author;
	int price;
}




//  Main Method
package com.tka.classandobject;

public class Main {

	public static void main(String[] args) {
		Laptop Asus = new Laptop();
		System.out.println();
		System.out.println();
		System.out.println( "Asus Brand = " + (Asus.brand = "Asus Vivobook 15"));
		System.out.println( "Asus Ram = " + (Asus.ram = 16)+ " GB");
		
		System.out.println("--------------");
		
		Employee e1 = new Employee();
		System.out.println("Employee Id = " +(e1.id = 101));
		System.out.println("Employee Name = " +(e1.name= "Naman"));
		System.out.println("Employee Salary = " +(e1.salary = 450000));
		
		System.out.println("--------------");
		
		
		Car c1 = new Car();
		System.out.println("Car Model = " + (c1.model = "Audi"));
		System.out.println("Car Price = " + (c1.price = 1450000));
		System.out.println("Car Color = " + (c1.color = "Black"));
		
		System.out.println("--------------------");
		
		
		Book b1 = new Book();
		System.out.println("Book Title = " + (b1.title = "Rich Dad Poor Dad"));
		System.out.println("Book Author = " + (b1.author = "Robert Toru Kiyosaki"));
		System.out.println("Book Price = " + (b1.price = 145)+"Rs");
		System.out.println("--------------");
	}

}
