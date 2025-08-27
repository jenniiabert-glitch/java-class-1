import java.util.Scanner;

public class Input {
  public static void main(String[] args) {

    // AREA OF A RECTANGLE

    Scanner scanner = new Scanner(System.in);

    int Length;
    int Width;

    System.out.print("Input in the Length : ");
    Length = scanner.nextInt();

    System.out.print("Input in the Width : ");
    Width = scanner.nextInt();

    int Area = Length * Width;

    System.out.println("The area is " + Area);

    System.out.println(Area);

    scanner.close();
  }
}