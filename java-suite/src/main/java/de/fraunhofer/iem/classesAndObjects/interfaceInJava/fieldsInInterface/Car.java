package de.fraunhofer.iem.classesAndObjects.interfaceInJava.fieldsInInterface;

/**
 * Demonstrates the implementing the interface that has fields
 *
 * @author Ranjith Krishnamurthy
 */
public class Car implements Vehicle {
    String modelNumber;
    String vehicleRegistrationNumber;
    private boolean isStart = false;

    public Car(String modelNumber, String vehicleRegistrationNumber) {
        this.modelNumber = modelNumber;
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
    }

    @Override
    public void start() {
        if (isStart) {
            System.err.println("Car is already started.");
        }

        isStart = true;
    }

    @Override
    public void stop() {
        if (!isStart) {
            System.err.println("Car is already stopped.");
        }

        isStart = false;
    }
}
