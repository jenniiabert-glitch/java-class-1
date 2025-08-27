import java.util.Scanner;

public class ass2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "password123"; // Set the correct password
        String userInput;

        // Loop until the user enters the correct password
        do {
            System.out.print("Enter your password: ");
            userInput = scanner.nextLine();
            if (!userInput.equals(correctPassword)) {
                System.out.println("Incorrect password. Try again.");
            }
        } while (!userInput.equals(correctPassword));

        System.out.println("Password accepted. Access granted!");
        scanner.close();
    }
}
