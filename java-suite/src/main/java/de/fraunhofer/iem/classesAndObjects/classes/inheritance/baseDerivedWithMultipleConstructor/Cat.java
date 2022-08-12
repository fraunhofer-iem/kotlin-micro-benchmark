package de.fraunhofer.iem.classesAndObjects.classes.inheritance.baseDerivedWithMultipleConstructor;

/**
 * Inherit the Animal class and can override makeNoise method
 * <p>
 * Note:
 * 1. Two constructor calls different super class constructor
 *
 * @author Ranjith Krishnamurthy
 */
public class Cat extends Animal {
    public Cat(String DNA) {
        super(DNA);
    }

    public Cat() {
        super();
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}
