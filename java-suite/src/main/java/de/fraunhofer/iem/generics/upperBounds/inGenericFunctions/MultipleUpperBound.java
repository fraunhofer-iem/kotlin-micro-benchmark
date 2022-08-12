package de.fraunhofer.iem.generics.upperBounds.inGenericFunctions;

import de.fraunhofer.iem.generics.wildCardTypeArgument.DifferentTypedPair;

public class MultipleUpperBound {
    /**
     * Demonstrates the multiple upper bound in the generic function in Java
     * <p>
     * Note:
     * 1. If multiple upper bounds are given, then that means a Class should extends all of those upper bound then only
     * its valid otherwise compilation error
     *
     * @author Ranjith Krishnamurthy
     */
    public static <A extends Number, B extends Comparable<B> & CharSequence> DifferentTypedPair<A, B> createDifferentTypedPair(A first, B second) {
        return new DifferentTypedPair<>(first, second);
    }

    /**
     * Demonstrates the usage of the multiple upper bounded generic function in Java
     *
     * @author Ranjith Krishnamurthy
     */
    public static void main(String[] args) {
        System.out.println(createDifferentTypedPair(254564, "Ranjith"));
    }
}
