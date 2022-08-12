package de.fraunhofer.iem.classesAndObjects.visibilityModifiers;

/**
 * Demonstrates the visibility modifiers in Java
 * <p>
 * Note:
 * 1. This example is taken from the https://kotlinlang.org/docs/visibility-modifiers.html
 *
 * @author Ranjith Krishnamurthy
 */
public class Outer {
    private int a = 1;
    protected int b = 2;
    int d = 4;

    protected class Nested {
        public int e = 5;
    }
}
