package de.fraunhofer.iem.classesAndObjects.interfaceInJava.defaultImplementationInInterface;

/**
 * Demonstrates the default implementation of a method in Interface.
 *
 * @author Ranjith Krishnamurthy
 */
public interface Vehicle {
    String modelNumber = "Its Interface model number";
    String vehicleRegistrationNumber = "Its Interface vehicle registration number";

    public void start();

    public void stop();

    default public void displayModelNumber() {
        System.out.println("Interface implementation = " + modelNumber);
    }

    default public void displayVehicleRegistrationNumber() {
        System.out.println("Interface implementation = " + vehicleRegistrationNumber);
    }
}
