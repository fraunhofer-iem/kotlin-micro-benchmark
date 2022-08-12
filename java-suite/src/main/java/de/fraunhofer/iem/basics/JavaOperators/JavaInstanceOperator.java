package de.fraunhofer.iem.basics.JavaOperators;

/**
 * Demonstrates the instanceof operator in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaInstanceOperator {
    public static void main(String[] args) {
        String name = "Ranjith";

        System.out.println(getLength(name));
        System.out.println(getLength(1));
        System.out.println(getLowerCase(1));
        System.out.println(getLowerCase(name));
    }

    /**
     * Demonstrates instanceof
     */
    private static int getLength(Object ob) {
        if (ob instanceof String) {
            return ((String) ob).length();
        }

        return -1;
    }

    /**
     * Demonstrates not instanceof
     */
    private static String getLowerCase(Object ob) {
        if (!(ob instanceof String)) {
            return "na";
        }

        return ((String) ob).toLowerCase();
    }
}