package methodoveloading;

public class Demo {
	void show(int n, String email) {
		System.out.println("Student Name & Id :- " + (n+email));
		
	}
	void show(String email,int n) {
		System.out.println("Student Name & Id :- " + (email +  n));
		
	}
	void calculate(int a) {
        System.out.println("Square = " + (a * a));
    }

    void calculate(int a, int b) {
        System.out.println("Cube = " + (a * a * a));
    }

	
	
}
