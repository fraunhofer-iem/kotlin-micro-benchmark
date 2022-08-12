package de.fraunhofer.iem.classesAndObjects.classes.inheritance.callingSuperClassImpl;

/**
 * Demonstrates the calling of super class implementation
 *
 * @author Ranjith Krishnamurthy
 */
public class Derived extends Base {
    @Override
    public void print() {
        super.print();
        System.out.println("Derived");
    }
}
