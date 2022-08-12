package de.fraunhofer.iem.classesAndObjects.interfaceInJava.interfaceInheritance;

/**
 * Demonstrates the multiple inheritance in interface
 *
 * @author Ranjith Krishnamurthy
 */
public interface Movable extends Runnable, Walkable {
    public void jog();
}
