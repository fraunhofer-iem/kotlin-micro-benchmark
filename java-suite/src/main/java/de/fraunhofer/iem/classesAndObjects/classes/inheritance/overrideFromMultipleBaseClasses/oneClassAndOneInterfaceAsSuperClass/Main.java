package de.fraunhofer.iem.classesAndObjects.classes.inheritance.overrideFromMultipleBaseClasses.oneClassAndOneInterfaceAsSuperClass;

/**
 * Prints the Base1 --> print1 because Java takes by default implementation of the class not the interface to resolve the ambiguity
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static void main(String[] args) {
        new Derived().print1();
        new Derived().print2();
    }
}
