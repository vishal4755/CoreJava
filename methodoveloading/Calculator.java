package methodoveloading;

public class Calculator {
	void add(int a, int b) {
		int c = a + b;
		System.out.println("Addition Of Two Number :- " + c);

	}

	void add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("Addition Of Three Number :- " + d);

	}

	void multiply(int a, int b) {
		int c = a * b;
		System.out.println("Multiply Of Two Number :- " + c);
	}

	void multiply(int a, int b, int c) {
		int d = a * b * c;
		System.out.println("Multiply Of Two Number :- " + d);
	}

	void cirlce(double r) {
		System.out.println("Area Of Circle :- " + (3.14 * r * r));
	}

	void rectangle(double l, double b) {
		System.out.println("Area Of Rectangle :- " + (l * b));
	}

	void display(int a ,String name) {
		
		System.out.println("Integer Value :- " + a);
		System.out.println("Name :- " + name);
	}
	
	void sum(int s,int m) {
		System.out.println("Sum Of Two Number :- " + (s+m));
		
	}
	void sum(float s,float m) {
		System.out.println("Sum Of Two Number :- " + (s+m));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
