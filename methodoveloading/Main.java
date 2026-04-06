package methodoveloading;



public class Main {
	public static void main(String[] args) {
		Calculator ca = new Calculator();
		ca.add(20, 45);
		ca.add(10, 34, 50);
		System.out.println("------------------");
		ca.multiply(34, 50);
		ca.multiply(34, 50, 10);
		System.out.println("------------------");
		ca.cirlce(23);
		ca.rectangle(12, 10);
		System.out.println("------------------");
		ca.display(45, "Vishal");
		System.out.println("------------------");
		ca.sum(55, 78);
		ca.sum(4.5f, 66.7f);
		System.out.println("------------------");
		
		Demo d = new Demo();
		d.show(101 ,"vishal@gmail.com");
		d.show("karan@gmail.com", 203);
		System.out.println("------------------");
		
		 Student s1 = new Student();
	     Student s2 = new Student(101);
	     Student s3 = new Student(102, "Vishal");
	        s1.display();
	        s2.display();
	        s3.display();
	    	System.out.println("------------------");
	        
	       d.calculate(45);
	       d.calculate(34, 67);
	       
	       System.out.println("--------------------");
	       Login obj1 = new Login();
	        obj1.login("vishal");
	        obj1.login("vishal", "12345");

	}
	

}
