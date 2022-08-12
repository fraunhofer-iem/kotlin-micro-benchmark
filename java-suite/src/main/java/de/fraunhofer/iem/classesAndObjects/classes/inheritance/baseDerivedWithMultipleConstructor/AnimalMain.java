package de.fraunhofer.iem.classesAndObjects.classes.inheritance.baseDerivedWithMultipleConstructor;

/**
 * Instantiation example for the baseAndDerivedClass example code
 *
 * @author Ranjith Krishnamurthy
 */
public class AnimalMain {
    public static void main(String[] args) {
        displayAnimal(new Cat());
        displayAnimal(new Horse());
        displayAnimal(new Dog());
    }

    private static void displayAnimal(Animal animal) {
        animal.displayDNA();
        animal.makeNoise();
    }
}
