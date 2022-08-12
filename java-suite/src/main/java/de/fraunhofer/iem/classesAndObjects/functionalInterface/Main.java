package de.fraunhofer.iem.classesAndObjects.functionalInterface;

/**
 * Usage of the functional interface
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = () -> {
            System.out.println("Car is started");
        };
        vehicle.start();
        vehicle.stop();
    }
}
