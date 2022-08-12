package de.fraunhofer.iem.generics.upperBounds.inGenericFunctions;

import de.fraunhofer.iem.generics.wildCardTypeArgument.DifferentTypedPair;

public class Main {
    /**
     * Demonstrates the upper bound in the generic function in Java
     *
     * @author Ranjith Krishnamurthy
     */
    public static <A extends Number, B extends CharSequence> DifferentTypedPair<A, B> createDifferentTypedPair(A first, B second) {
        return new DifferentTypedPair<>(first, second);
    }

    /**
     * Demonstrates the usage of the upper bounded generic function in Java
     *
     * @author Ranjith Krishnamurthy
     */
    public static void main(String[] args) {
        System.out.println(createDifferentTypedPair(2646, "Ranjith"));
    }
}
