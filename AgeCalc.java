import java.util.Scanner;

public class AgeCalc {


    public static void main(String[] args) {
        System.out.println("Age Calculator");
        Scanner scanner = new Scanner(System.in);
        
        int userAge;
        System.out.print("Please type in your year of birth : ");
        userAge = scanner.nextInt();
        int year = 2025;
        int trueUserAge =  year - userAge;
        System.out.println("You age is " + trueUserAge );

        scanner.close();
    }
}
