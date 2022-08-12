package de.fraunhofer.iem.classesAndObjects.classes.constructors.argConstructor;

/**
 * Demonstrates the instantiation of the class with constructor that takes arguments
 * <p>
 * Note:
 * 1. Since attributes are package-private, in Java bytecode, attributes are accessed directly.
 *
 * @author Ranjith Krishnamurthy
 */
class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Ranjith", "K", 100);
        System.out.println(employee.firstName);
        System.out.println(employee.lastName);
        System.out.println(employee.age);
    }
}
