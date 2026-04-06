package methodoveloading;

class PrintDemo {

    static void print(int a) {
        System.out.println("One Parameter = " + a);
    }

    static void print(int a, int b) {
        System.out.println("Two Parameters = " + a + " " + b);
    }

    public static void main(String[] args) {
        print(10);
        print(10, 20);
    }
}
