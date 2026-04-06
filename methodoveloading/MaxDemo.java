package methodoveloading;

class MaxDemo {

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        MaxDemo obj = new MaxDemo();

        System.out.println(" Max value :- " + obj.max (10, 20));
        System.out.println(" Max value :- " + obj.max(10, 20, 30));
    }
}


