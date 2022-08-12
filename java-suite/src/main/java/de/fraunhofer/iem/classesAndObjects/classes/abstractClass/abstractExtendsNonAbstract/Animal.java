package de.fraunhofer.iem.classesAndObjects.classes.abstractClass.abstractExtendsNonAbstract;

/**
 * Abstract class extends the non-abstract class
 *
 * @author Ranjith Krishnamurthy
 */
abstract public class Animal extends NoiseBox {
    private String DNA;

    public Animal(String DNA) {
        this.DNA = DNA;
    }

    @Override
    public abstract void makeNoise();

    public void displayDNA() {
        System.out.println(DNA);
    }
}
