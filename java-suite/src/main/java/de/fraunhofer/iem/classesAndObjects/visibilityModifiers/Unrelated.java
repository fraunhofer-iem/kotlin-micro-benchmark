package de.fraunhofer.iem.classesAndObjects.visibilityModifiers;

/**
 * Demonstrates the visibility modifiers in Java
 * <p>
 * Note:
 * 1. This example is taken from the https://kotlinlang.org/docs/visibility-modifiers.html
 *
 * @author Ranjith Krishnamurthy
 */
public class Unrelated {
    public Unrelated(Outer outer) {
        // System.out.println(this.a);
        // System.out.println(this.b);
        // System.out.println(this.d);
        System.out.println(Outer.Nested.class);
        // System.out.println(new Outer.Nested().e);
    }
}
