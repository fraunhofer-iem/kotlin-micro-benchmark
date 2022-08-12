package de.fraunhofer.iem.classesAndObjects.classes.inheritance.overrideFromMultipleBaseClasses.twoInterfacesAsSuperClass;

/**
 * Base 1, interface with default method, First base class.
 *
 * @author Ranjith Krishnamurthy
 */
public interface Base1 {
    default public void print1() {
        System.out.println("Base1 --> print1");
    }

    default public void print2() {
        System.out.println("Base1 --> print2");
    }
}
