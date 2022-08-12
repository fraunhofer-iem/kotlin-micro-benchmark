package de.fraunhofer.iem.classesAndObjects.interfaceInJava.interfaceExample;

/**
 * Demonstrates the Interface in Java
 *
 * @author Ranjith Krishnamurthy
 */
public interface Vehicle {
    public void start();

    public void stop();

    public void accelerate(int speed);

    public void changeGear(int to);

    public int getCurrentSpeed();
}
