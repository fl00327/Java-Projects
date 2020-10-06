/**
 * ArrayExample1.java
 */

package org.com.fl00327;
/**
 * A simple class used to demonstrate deficiencies in arrays.
 * 
 * @author Stella Kazamia
 * @author Helen Treharne
 * @author Matthew Casey
 */
public class ArrayExample1 {

  /**
   * Main entry point: this is the first method that is run.
   * 
   * @param args
   *          The command line arguments.
   */
  public static void main(String[] args) {
    // Create an array of strings. Arrays always have a fixed size.
    String[] names = new String[20];

    // Assign values to the first two elements of the array.
    names[0] = "Helen";
    names[1] = "Stella"; // Toggle breakpoint here.

    // Loop through the array and print out all of its values.
    for (String name : names) {
      if (name != null) {
        System.out.println("Name is: " + name);
      }
    }
  }
}
