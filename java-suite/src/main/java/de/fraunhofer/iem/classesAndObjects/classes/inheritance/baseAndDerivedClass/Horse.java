package de.fraunhofer.iem.classesAndObjects.classes.inheritance.baseAndDerivedClass;

/**
 * Inherit the Animal class and can override makeNoise method
 *
 * @author Ranjith Krishnamurthy
 */
public class Horse extends Animal {
    public Horse(String DNA) {
        super(DNA);
    }

    @Override
    public void makeNoise() {
        System.out.println("Neigh");
    }
}
