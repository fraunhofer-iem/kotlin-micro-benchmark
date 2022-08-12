package de.fraunhofer.iem.classesAndObjects.classes.inheritance.baseAndDerivedClass;

/**
 * Non-class that can be a superclass to another class.
 *
 * @author Ranjith Krishnamurthy
 */
public class Animal {
    private String DNA;

    public Animal(String DNA) {
        this.DNA = DNA;
    }

    /**
     * Derived class can override this method since it is a non-final method
     */
    public void makeNoise() {
        System.out.println("This is abstract animal sound!");
    }

    /**
     * Derived class can not override this method since it is a final method
     */
    public final void displayDNA() {
        System.out.println(DNA);
    }
}
