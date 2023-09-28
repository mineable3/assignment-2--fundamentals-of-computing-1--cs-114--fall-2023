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

      for (int row = 1; row < diamondSize; row++) {
        //moving the cursor to the desired column
        System.out.print(" " + " ".repeat(Math.abs((diamondSize) - (2 * row))));

        System.out.println("* ".repeat((-Math.abs((2 * row) - diamondSize)) + diamondSize));
      }

      System.out.print(" ".repeat(diamondSize) + "*\n");

    } else {
      for (int row = 0; row < diamondSize; row++) {

        //top half of the diamond
        if (row < (int)(diamondSize / 2)) {

          //padding
          for (int numOfSpaces = (int)((diamondSize) / 2) - row; numOfSpaces > 0; numOfSpaces--) {
            System.out.print(" ");
          }

          for (int numOfAstrisks = 1 + (2 * row); numOfAstrisks > 0; numOfAstrisks--) {
            System.out.print("*");
          }

          System.out.println();
        }

        //the center line of the diamond
        if (row == (int)(diamondSize / 2)) {
          for (int numOfAstrisks = 0; numOfAstrisks < diamondSize; numOfAstrisks++) {
            System.out.print("*");
          }
          System.out.println();
        }

        //bottom half of the diamond
        if (row > (int)(diamondSize / 2)) {

          //padding
          for (int numOfSpaces = (int)((-1) * (diamondSize) / 2) + row; numOfSpaces > 0; numOfSpaces--) {
            System.out.print(" ");
          }

          for (int numOfAstrisks = (int)(diamondSize) - ((2 * (row - (int)(diamondSize / 2)))); numOfAstrisks > 0; numOfAstrisks--) {
            System.out.print("*");
          }

          System.out.println();
        }

      }
    }
  }
}
