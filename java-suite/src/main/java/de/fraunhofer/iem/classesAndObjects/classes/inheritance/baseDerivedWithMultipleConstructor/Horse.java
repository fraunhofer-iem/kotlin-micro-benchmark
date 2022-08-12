package de.fraunhofer.iem.classesAndObjects.classes.inheritance.baseDerivedWithMultipleConstructor;

/**
 * Inherit the Animal class and can override makeNoise method
 * <p>
 * Note:
 * 1. One constructor calls the super class constructor
 * 2. Second constructor calls the first constructor but not the super class constructor
 *
 * @author Ranjith Krishnamurthy
 */
public class Horse extends Animal {
    public Horse(String DNA) {
        super(DNA);
    }

    public Horse() {
        this("GGAAACT");
    }

    @Override
    public void makeNoise() {
        System.out.println("Neigh");
    }
}
