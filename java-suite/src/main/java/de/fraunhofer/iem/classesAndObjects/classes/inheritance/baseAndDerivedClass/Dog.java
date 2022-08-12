package de.fraunhofer.iem.classesAndObjects.classes.inheritance.baseAndDerivedClass;

/**
 * Inherit the Animal class and can override makeNoise method
 *
 * @author Ranjith Krishnamurthy
 */
public class Dog extends Animal {
    public Dog(String DNA) {
        super(DNA);
    }

    @Override
    public void makeNoise() {
        System.out.println("Bow Bow");
    }
}
