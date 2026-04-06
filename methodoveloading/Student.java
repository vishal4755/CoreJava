package methodoveloading;

class Student {

    int id;
    String name;

    Student() {
        id = 0;
        name = "Unknown";
    }

    Student(int i) {
        id = i;
    }

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println( "Student Id :- " + id + " " + "Student Name ;- " + name);
    }
    
    void login(String username) {
        System.out.println("Login with username: " + username);
    }

    void login(String username, String password) {
        System.out.println("Login with username and password: " + username);
    }


}