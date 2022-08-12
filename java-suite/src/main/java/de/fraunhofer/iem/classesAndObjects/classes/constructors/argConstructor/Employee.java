package de.fraunhofer.iem.classesAndObjects.classes.constructors.argConstructor;

/**
 * Demonstrates the constructor that takes arguments.
 *
 * Note:
 * 1. Attributes default visibility modifier is package-private
 * 2. Constructor default visibility modifier is also package-private
 *
 * @author Ranjith Krishnamurthy
 */
public class Employee {
    String firstName;
    String lastName;
    int age;

    Employee(String firstName, String lastName, int age) {
        System.out.println("Initializer block");
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        System.out.println("Completed Initializer block");
    }
}
