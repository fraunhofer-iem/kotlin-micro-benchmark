package de.fraunhofer.iem.classesAndObjects.interfaceInJava.fieldsInInterface;

/**
 * Usage of interface and the class that implements interface that has fields
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static void main(String[] args) {
        Car vehicle = new Car("ABC", "1234ADFR");
        vehicle.start();
        System.out.println(vehicle.modelNumber);    // Prints the class value
        System.out.println(((Vehicle) vehicle).vehicleRegistrationNumber);  // Prints the interface value
    }
}
