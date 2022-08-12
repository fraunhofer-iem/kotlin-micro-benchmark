package de.fraunhofer.iem.generics.rawType;

import de.fraunhofer.iem.generics.wildCardTypeArgument.DifferentTypedPair;

/**
 * Demonstrates the raw types in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static void main(String[] args) {
        DifferentTypedPair differentTypedPair = new DifferentTypedPair(120, "Ranjith");
        DifferentTypedPair<Double, Double> temp = differentTypedPair;

        try {
            // Can not cast, because typ system is broken because of the raw types
            System.out.println(temp.getSecond().intValue());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
