package de.fraunhofer.iem.classesAndObjects.functionalInterface;

/**
 * Demonstrates the functional interface
 *
 * @author Ranjith Krishnamurthy
 */
@FunctionalInterface
public interface Vehicle {
    public void start();

    default public void stop() {
        System.out.println("Vehicle is stopped");
    }
}
