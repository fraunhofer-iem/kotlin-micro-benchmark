package de.fraunhofer.iem.classesAndObjects.classes.abstractClass.abstractExtendsNonAbstract;

/**
 * Demonstrates the usage of the abstract class that extends the non-abstract class
 *
 * @author Ranjith Krishnamurthy
 */
public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Cat("AAATGC");
        animal.makeNoise();
        animal.displayDNA();
        new NoiseBox().makeNoise();
    }
}
