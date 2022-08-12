package de.fraunhofer.iem.generics.simpleGenericExample;

/**
 * Demonstrates the generics in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class CustomPair<T> {
    private T first;
    private T second;

    public CustomPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
