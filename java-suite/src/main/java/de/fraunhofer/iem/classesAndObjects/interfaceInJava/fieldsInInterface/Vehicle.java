package de.fraunhofer.iem.classesAndObjects.interfaceInJava.fieldsInInterface;

/**
 * Demonstrates the fields in Interface. In Java, fields in interface is always final
 *
 * @author Ranjith Krishnamurthy
 */
public interface Vehicle {
    String modelNumber = "Its Interface model number";
    String vehicleRegistrationNumber = "Its Interface vehicle registration number";

    public void start();

    public void stop();
}
