package de.fraunhofer.iem.generics.genericFunctions;

import de.fraunhofer.iem.generics.wildCardTypeArgument.DifferentTypedPair;

public class Main {
    /**
     * Demonstrates the generic function in Java
     *
     * @author Ranjith Krishnamurthy
     */
    public static <A, B> DifferentTypedPair<A, B> createDifferentTypedPair(A first, B second) {
        return new DifferentTypedPair<>(first, second);
    }

    /**
     * Demonstrates the usage of the generic function in Java
     *
     * @author Ranjith Krishnamurthy
     */
    public static void main(String[] args) {
        System.out.println(createDifferentTypedPair(2646, 542.548D));
    }
}
