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

      for (int numOfSpaces = diamondSize; numOfSpaces > 0; numOfSpaces--) {
        System.out.print(" ");
      }
      System.out.print("*");

      for (int row = 0; row < diamondSize; row++) {

        //top half of the diamond
        if (row < (int)(diamondSize / 2)) {

          //padding
          for (int numOfSpaces = (int)(diamondSize / 2) - row; numOfSpaces > 0; numOfSpaces--) {
            System.out.print("  ");
          }

          for (int numOfAstrisks = (2 * row); numOfAstrisks > 0; numOfAstrisks--) {
            System.out.print(" *");
          }

          System.out.println();
        }

        //the center line of the diamond
        if (row == (int)(diamondSize / 2)) {
          for (int numOfAstrisks = 0; numOfAstrisks < diamondSize; numOfAstrisks++) {
            System.out.print(" *");
          }
          System.out.println();
        }

        //bottom half of the diamond
        if (row > (int)(diamondSize / 2)) {

          //padding
          for (int numOfSpaces = (int)(-0.5 * diamondSize) + row; numOfSpaces > 0; numOfSpaces--) {
            System.out.print("  ");
          }

          for (int numOfAstrisks = (int)(2 * diamondSize) - (2 * row); numOfAstrisks > 0; numOfAstrisks--) {
            System.out.print(" *");
          }

          System.out.println();
        }
      };

      for (int numOfSpaces = diamondSize; numOfSpaces > 0; numOfSpaces--) {
        System.out.print(" ");
      }
      System.out.println("*");

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
          for (int numOfSpaces = (int)(-0.5 * diamondSize) + row; numOfSpaces > 0; numOfSpaces--) {
            System.out.print(" ");
          }

          for (int numOfAstrisks = (int)(2 * diamondSize) - (2 * row) - 1; numOfAstrisks > 0; numOfAstrisks--) {
            System.out.print("*");
          }

          System.out.println();
        }

      }
    }
  }
}
