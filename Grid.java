
/*The purpose of this program is to prompt the user for two integers representing a
number of rows and columns, and then print a grid of integers from 1 to (rows * columns)
in column major order.

*/
// This line of code imports the classes in java under the util name
import java.util.*;

// This line is my class entitled Grid
public class Grid {
  // This is my main method
  public static void main(String[] args) {
    // Asking the user for how many rows he or she would like
    System.out.print("Please enter the number of rows you'd like: ");
    // using the Scanner class to detect input from the keyboard
    Scanner console = new Scanner(System.in);
    // storing input form the keyboard in a integer variable called rows
    int rows = console.nextInt();
    // Asking the user for how many columns he or she would like
    System.out.print("Please enter the number of columns you'd like: ");
    // storing input from the keyboard in integer variable called columns
    int columns = console.nextInt();
    // calling my static method named rowsColumns using the variables rows and
    // calumns as parameters
    rowsColumns(rows, columns);
  }

  /*
   * static mathod named rowsCalumns which take two integer parameters and
   * executes a for loop to print the correct number of rows and columns
   */
  public static void rowsColumns(int numrows, int numcolumns) {
    for (int i = 1; i <= numrows; i++) {
      for (int j = 0; j < numcolumns; j++) {
        System.out.print(i + numrows * j + " ");
      }
      System.out.println();
    }
  }
}
