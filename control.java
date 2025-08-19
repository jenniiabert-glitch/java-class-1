
import java.util.Scanner;

public class control {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in); 
        float height = newScanner.nextFloat();
        if (height < 6.0) {
            System.out.println("You are short");

        }else if (height > 3.5) {
            System.out.println("you are medium height");
        }
        else{
            System.out.println("You are tall");
        }
    }
}
