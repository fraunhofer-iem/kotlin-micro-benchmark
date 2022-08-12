package de.fraunhofer.iem.classesAndObjects.classes.inheritance.overrideFromMultipleBaseClasses.twoInterfacesAsSuperClass;

/**
 * Base 2, interface with default method, Second base class.
 *
 * @author Ranjith Krishnamurthy
 */
public interface Base2 {
    default public void print1() {
        System.out.println("Base2 --> print1");
    }

    default public void print2() {
        System.out.println("Base2 --> print2");
    }
}
