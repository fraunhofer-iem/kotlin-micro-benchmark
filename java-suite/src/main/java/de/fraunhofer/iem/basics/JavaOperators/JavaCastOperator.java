package de.fraunhofer.iem.basics.JavaOperators;

/**
 * Demonstrates the Cast operator in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaCastOperator {
    public static void main(String[] args) {
        dummy("Ranjith");
        dummy(null);
        dummy(123); //ClassCastException
    }

    private static void dummy(Object ob) {
        String temp = (String) ob;

        System.out.println("String = " + temp);
    }
}
