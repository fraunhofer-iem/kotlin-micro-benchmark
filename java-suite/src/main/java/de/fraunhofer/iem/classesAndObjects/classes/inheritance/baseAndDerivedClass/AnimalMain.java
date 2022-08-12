package de.fraunhofer.iem.classesAndObjects.classes.inheritance.baseAndDerivedClass;

/**
 * Instantiation example for the baseAndDerivedClass example code
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
