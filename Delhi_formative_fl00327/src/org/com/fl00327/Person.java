/**
 * Test.java
 */

package org.com.fl00327;

/**
 * Class representing attributes and behaviour of a person.
 * 
 * @author Stella Kazamia
 * @author Helen Treharne
 * @author Matthew Casey
 */
public class Person implements Comparable<Person> {

  /** Their forename. */
  private String forename;

  /** Their surname. */
  private String surname;

  /** Attribute to store the person's age in years. */
  private int    age;

  /**
   * Constructor allowing the person's details to be specified.
   * 
   * @param forename
   *          their forename.
   * @param surname
   *          their surname.
   * @param age
   *          their age.
   */
  public Person(String forename, String surname, int age) {
    super();
    this.forename = forename;
    this.surname = surname;
    this.age = age;
  }

  /**
   * This method is required for the Comparable interface. It allows us to sort Person objects into an order based upon a specified
   * sort order. Here the order is alphabetic by surname only.
   * 
   * @param person
   * @return 0 if the two Person objects contain the same information, -1 if 'this' is less than 'o', 1 if 'this' is grater than
   *         'o'.
   * 
   * @see java.lang.Comparable#compareTo(java.lang.Object)
   */
  @Override
  public int compareTo(Person person) {
    return this.getSurname().compareTo(person.getSurname());
  }

  /**
   * Getter method to return the person's age.
   * 
   * @return the person's age.
   */
  public int getAge() {
    return this.age;
  }

  /**
   * @return the person's forename.
   */
  public String getForename() {
    return this.forename;
  }

  /**
   * @return the person's surname.
   */
  public String getSurname() {
    return this.surname;
  }

  /**
   * @return a String representation of the person's details.
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return this.forename + " " + this.surname + " (" + this.age + ")";
  }
}
