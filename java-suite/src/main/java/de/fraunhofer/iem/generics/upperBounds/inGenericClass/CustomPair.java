package de.fraunhofer.iem.generics.upperBounds.inGenericClass;

/**
 * Demonstrates the upper bounds in generics class in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class CustomPair<A extends Number, B extends CharSequence & Comparable<B>> {
    private A first;
    private B second;

    public CustomPair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}
