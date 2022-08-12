package de.fraunhofer.iem.classesAndObjects.classes.constructors.multipleConstructors;

/**
 * Instantiation for the example of multiple constructor
 *
 * @author Ranjith Krishnamurthy
 */
public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Ranjith", "K", 100);
        System.out.println(employee.firstName);
        System.out.println(employee.lastName);
        employee.age = 200;
        System.out.println(employee.age);
    }
}
