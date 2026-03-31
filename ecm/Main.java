package com.tks.ecm;

public class Main {
	public static void main(String[] args) {
		System.out.println();
		Student s = new Student();
		s.setId(121);
		s.setName("Karan");
		System.out.println("Student Id :- " + s.getId());
		System.out.println("Student Name :- " + s.getName());
		System.out.println("----------------");

		Bank e = new Bank();
		e.initialBal(20000);
		e.deposit(45000);
		e.withdraw(10000);
		System.out.println("Remaining Balance :-" + e.getBalance());
		System.out.println("----------------");

		Employee e1 = new Employee();
		e1.setSalary(50000);
		System.out.println("Salary :- " + e1.getSalary());
		System.out.println("----------------");

		Car c = new Car();
		c.setBrand("BMW");
		c.setPrice("5Cr.");
		System.out.println("Car Brand :- " + c.getBrand());
		System.out.println("Car Price :- " + c.getPrice());
		System.out.println("----------------");

		Discount d = new Discount();
		d.setPrice(12345);
		d.setDiscount(15);
		System.out.println("Price :- " + d.getPrice());
		System.out.println("Discount :- " + d.getDiscount());
		System.out.println("Discount Price :-  " + d.getDiscountPrice());
		System.out.println("----------------");

		Welcome w = new Welcome();
		w.java();
		System.out.println("----------------");

		Addition a = new Addition();
		a.sum(24, 50);
		System.out.println("----------------");

		Multiply m = new Multiply();
		System.out.println("Multiplication Of Two Number :- " + m.mul(29, 9));
		System.out.println("----------------");

		Name n = new Name();
		String name = n.getName();
		System.out.println("Your Name :- " + name);
		System.out.println("----------------");

		EvenOddNum eo = new EvenOddNum();
		boolean num = eo.number(15);
		System.out.println("This Number  :- " + num);
		System.out.println("----------------");

		Constructor c1 = new Constructor();
		System.out.println("----------------");

		BookInfo book = new BookInfo("Achemist", 200);
		System.out.println("----------------");

		ConsOverloading con = new ConsOverloading();
		con.display();
		ConsOverloading con1 = new ConsOverloading(24);
		con1.display1();
		System.out.println("----------------");

		CopyConstructor copy = new CopyConstructor("Vishal", 23);
		CopyConstructor copy1 = new CopyConstructor(copy);
		copy.display();
		copy1.display();
		System.out.println("----------------");

		AreaOfRectangle area = new AreaOfRectangle(50, 100);
		area.area();
		System.out.println("----------------");

		Account acc = new Account(10000);
		acc.deposit(5000);
		acc.withdraw(3000);
		System.out.println("Current Balance: " + acc.getBalance());
		System.out.println("----------------");

		Student1 s2 = new Student1("Vishal", 72);
		System.out.println("Name: " + s2.getName());
		System.out.println("Marks: " + s2.getMarks());
		System.out.println("Grade: " + s2.getGrade());
		System.out.println("----------------");

		Mobile m2 = new Mobile("Samsung", 60000);
		System.out.println("Model: " + m2.getModel());
		System.out.println("Price: " + m2.getPrice());
		System.out.println("Discount Price: " + m2.discount());
		System.out.println("----------------");

		Emp em = new Emp("Vishal", 50000);
		em.increment();
		em.display();
		System.out.println("----------------");

		LibraryBook b1 = new LibraryBook(1, "Java Basics", "James");
		LibraryBook b2 = new LibraryBook(2, "Python Guide", "Guido");
		LibraryBook b3 = new LibraryBook(3, "java Programming", "Bjarne");
		b1.display();
		b2.display();
		b3.display();
		System.out.println("--------  End  --------");

	}
}