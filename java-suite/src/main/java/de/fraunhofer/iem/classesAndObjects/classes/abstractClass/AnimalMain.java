package de.fraunhofer.iem.classesAndObjects.classes.abstractClass;

/**
 * Demonstrates the usage of abstract class
 *
 * @author Ranjith Krishnamurthy
 */
public class AnimalMain {
    public static void main(String[] args) {
        displayAnimal(new Cat("AAATGC"));
        displayAnimal(new Horse("ATTCG"));
        displayAnimal(new Dog("CGTTA"));
    }

    private static void displayAnimal(Animal animal) {
        animal.displayDNA();
        animal.makeNoise();
    }
}
