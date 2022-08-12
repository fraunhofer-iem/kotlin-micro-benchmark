package de.fraunhofer.iem.classesAndObjects.classes.abstractClass;

/**
 * Class that extends Animal
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
