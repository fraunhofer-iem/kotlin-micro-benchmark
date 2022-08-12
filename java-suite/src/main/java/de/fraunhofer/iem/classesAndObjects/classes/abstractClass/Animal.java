package de.fraunhofer.iem.classesAndObjects.classes.abstractClass;

/**
 * Demonstrate the abstract class
 *
 * @author Ranjith Krishnamurthy
 */
public abstract class Animal {
    private String DNA;

    public Animal(String DNA) {
        this.DNA = DNA;
    }

    public abstract void makeNoise();

    public void displayDNA() {
        System.out.println(DNA);
    }
}
