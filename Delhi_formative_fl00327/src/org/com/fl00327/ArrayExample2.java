/**
 * ArrayExample2.java
 */

package org.com.fl00327;

import java.util.Scanner;

/**
 * A simple class used to demonstrate deficiencies in arrays.
 * 
 * @author Stella Kazamia
 * @author Helen Treharne
 * @author Matthew Casey
 */
public class ArrayExample2 {

  /**
   * Main entry point: this is the first method that is run.
   * 
   * @param args
   *          The command line arguments.
   */
  public static void main(String[] args) {
    // Create an array of strings. Arrays always have a fixed size.
    String[] names = new String[4];

    // Now read in names from the command line to put into the array.
    boolean finished = false;
    int i = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter names to add to the array, one per line");

    // Continue reading until "exit" is entered.
    while (!finished) {
      String line = scanner.nextLine();

      // Check for exit.
      if (line.startsWith("exit")) {
        finished = true;
      }
      else {
        // Not exit, so add the name to the array - watch out though, we are not check the length of the array.
        names[i] = line;
        i++;
        finished = !scanner.hasNextLine();
      }
    }

    scanner.close();

    // Loop through the array and print out all of its values.
    for (String name : names) {
      if (name != null) {
        System.out.println("Name is: " + name);
      }
    }
  }
}
