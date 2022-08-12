package de.fraunhofer.iem.generics.wildCardTypeArgument;

/**
 * Demonstrates the wildcard type parameter in member of a generic class
 *
 * @author Ranjith Krishnamurthy
 */
public class DifferentTypedPair<A, B> {
    private A first;
    private B second;

    // wild card type parameter
    public void replace(DifferentTypedPair<? extends A, ? extends B> differentTypedPair) {
        this.first = differentTypedPair.getFirst();
        this.second = differentTypedPair.getSecond();
    }

    public DifferentTypedPair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public void setSecond(B second) {
        this.second = second;
    }
}
