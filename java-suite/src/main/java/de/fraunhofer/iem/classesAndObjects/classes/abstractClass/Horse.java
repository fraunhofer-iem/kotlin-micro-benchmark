package de.fraunhofer.iem.classesAndObjects.classes.abstractClass;

/**
 * Class that extends Animal
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
