package methodoveloading;

public class OverloadMainMethod {
	

	    public static void main(String[] args) {
	        System.out.println("Original main method");
	        main(10);
	    }

	    public static void main(int a) {
	        System.out.println("Overloaded main method: " + a);
	    }
	}


