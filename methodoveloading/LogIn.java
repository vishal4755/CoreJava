
package methodoveloading;
class Login {

    void login(String username) {
        System.out.println("Login with username: " + username);
    }

    void login(String username, String password) {
        System.out.println("Login with username and password: " + username);
    }

    public static void main(String[] args) {
        Login obj1 = new Login();
        obj1.login("vishal");
        obj1.login("vishal", "12345");
    }
}