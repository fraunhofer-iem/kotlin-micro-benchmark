package de.fraunhofer.iem.classesAndObjects.classes.constructors.multipleConstructors;

/**
 * Demonstrates the multiple constructor in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class Employee {
    String firstName;
    String lastName;
    int age;

    Employee(String firstName) {
        System.out.println("Initializer block");
        this.firstName = firstName;
        System.out.println("Completed Initializer block");
    }

    Employee(String firstName, String lastName) {
        this(firstName);
        this.lastName = lastName;
    }

    Employee(String firstName, String lastName, int age) {
        this(firstName, lastName);
        this.age = age;
    }
}
