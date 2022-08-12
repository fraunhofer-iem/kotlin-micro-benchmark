package de.fraunhofer.iem.classesAndObjects.classes.inheritance.overrideFromMultipleBaseClasses.twoInterfacesAsSuperClass;

/**
 * Calls the Derived class implementation
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static void main(String[] args) {
        new Derived().print1();
        new Derived().print2();
    }
}
