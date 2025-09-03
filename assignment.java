
import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Ask the user for their last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Ask the user for their month of birth
        System.out.print("Enter your month of birth (e.g., January): ");
        String monthOfBirth = scanner.nextLine();

        // Ask the user if they are married
        System.out.print("Are you married? (yes or no): ");
        String maritalStatus = scanner.nextLine();

        // Create an array to store the user's information
        String[] userInfo = new String[4]; // Array with 4 elements
        userInfo[0] = firstName;         // Store first name
        userInfo[1] = lastName;          // Store last name
        userInfo[2] = monthOfBirth;      // Store month of birth
        userInfo[3] = maritalStatus;     // Store marital status

        // Print out the user's information
        System.out.println("User Information:");
        System.out.println("First Name: " + userInfo[0]);
        System.out.println("Last Name: " + userInfo[1]);
        System.out.println("Month of Birth: " + userInfo[2]);
        System.out.println("Marital Status: " + userInfo[3]);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
