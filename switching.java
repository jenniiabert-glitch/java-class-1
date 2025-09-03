
import java.util.Scanner;

public class switching {
    public static void main(String[] args) {
        /*
         * char input: A,B, C, D, E
         * if input is A = PERFECT
         * if input is B = VERY GOOD
         * if input is C = GOOD
         * if input is D = POOR
         * if input is E = VERY POOR
         */
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Input you grade here........A - E");
        String output =  scanner.nextLine();
     // if (output.equals("A")) {
        //     System.out.println("Perfect Score");
        // }else if (output.equals("B")){
        //     System.out.println("Very Good");
        // }else if (output.equals("C")){
        //     System.out.println("Good");
        // }else if (output.equals("D")){
        //     System.out.println("Poor");
        // }else if (output.equals("E")){
        //     System.out.println("Very Poor");
        // }else{
        //     System.out.println("Grade has to be between A-E");
        // }

         //switch case
         
        switch (output) {
            case "A":
                 System.out.println("Perfect Score");
                break;
            case "B":
                 System.out.println("Very Good");
                break;
            case "C":
                 System.out.println("Good");
                break;
            case "D":
                 System.out.println("Poor");
                break;
            case "E":
                 System.out.println("Very Poor");
                break;
            default:
                System.out.println("Output must be between A-E");
                break;
        }

        scanner.close();

       
    }
}
