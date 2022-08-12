package de.fraunhofer.iem.classesAndObjects.classes.abstractClass;

/**
 * Class that extends Animal
 *
 * @author Ranjith Krishnamurthy
 */
public class Cat extends Animal {
    public Cat(String DNA) {
        super(DNA);
    }
    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}
