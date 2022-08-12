package de.fraunhofer.iem.classesAndObjects.visibilityModifiers;

/**
 * Demonstrates the visibility modifiers in Java
 * <p>
 * Note:
 * 1. This example is taken from the https://kotlinlang.org/docs/visibility-modifiers.html
 *
 * @author Ranjith Krishnamurthy
 */
public class SubClass extends Outer {
    public void display() {
        // a is not visible here
        // System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.d);
        System.out.println(Nested.class);
        System.out.println(new Nested().e);
    }
}
