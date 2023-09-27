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
      System.out.print(" ".repeat(diamondSize) + "*\n");

      for (int i = 1; i < diamondSize; i++) {
        System.out.print(" " + " ".repeat(Math.abs((diamondSize) - (2 * i))));
        System.out.println("*");
      }

      System.out.print(" ".repeat(diamondSize) + "*\n");

    } else {
      for (int i = 0; i < diamondSize; i++) {
        System.out.print(" ".repeat(Math.abs((diamondSize / 2) - i)));
        System.out.println("*");
      }
    }
  }
}
