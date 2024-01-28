import java.util.Scanner;

public class Authenticator {
    private String username;
    private String password;

    public Authenticator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }

    // Example usage
    public static void main(String[] args) {
        Authenticator auth = new Authenticator("myusername", "mypassword");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String enteredUsername = scanner.nextLine();
        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        if (auth.authenticate(enteredUsername, enteredPassword)) {
            System.out.println("Authentication successful. Access granted.");
        } else {
            System.out.println("Authentication failed. Access denied.");
        }
    }
}
 