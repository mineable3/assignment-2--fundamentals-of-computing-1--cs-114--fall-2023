import java.util.InputMismatchException;
import java.util.Scanner;

public class Diamond {

  public static void main(String[] args) {

    boolean isEven = false;
    int diamondSize = 0;
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number");

    try {
      diamondSize = scan.nextInt();
      scan.close();
    } catch (InputMismatchException ie) {
      scan.close();
      throw new InputMismatchException("You must enter an int");
    }

    if ((diamondSize % 2) == 0) {
      isEven = true;
    }

    if (isEven) {
      //Try appending the top and bottom astrisk seperatly for their special padding
      for (int i = 0; i < diamondSize + 1; i++) {
      //padding
        System.out.print(" ".repeat(Math.abs((diamondSize) - (2 * i))));
        System.out.println("*");
      }
    } else {
      for (int i = 0; i < diamondSize; i++) {
      //padding
        System.out.print(" ".repeat(Math.abs((diamondSize / 2) - i)));
        System.out.println("*");
      }
    }
  }
}
