package de.fraunhofer.iem.classesAndObjects.classes.inheritance.baseDerivedWithMultipleConstructor;

/**
 * Inherit the Animal class and can override makeNoise method
 * <p>
 * Note:
 * 1. Both the constructor calls the same super class constructor
 *
 * @author Ranjith Krishnamurthy
 */
public class Dog extends Animal {
    public Dog(String DNA) {
        super(DNA);
    }

    public Dog() {
        super("AAATGTG");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bow Bow");
    }
}
