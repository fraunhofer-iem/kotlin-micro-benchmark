package de.fraunhofer.iem.basics.dataTypes;

/**
 * Demonstrates the Java literals
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaLiterals {
    /**
     * Demonstrates the Literals in Java
     * <p>
     * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
     */
    private static Number getDynamicNumber(String type) {
        switch (type) {
            case "n1":
                return 123;
            case "n2":
                return 123L;
            case "n3":
                return 0x0F;
            case "n4":
                return 0b00001011;
            case "r1":
                return 123.5;
            case "r2":
                return 123.5e10;
            case "r3":
                return 123.5f;
            case "r4":
                return 123.554F;
            case "mr1":
                return 1_000_000;
            case "mr2":
                return 0b11111111_10001001_10111111;
            default:
                return 0;
        }
    }

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int n1 = (int) getDynamicNumber("n1");
        long n2 = (long) getDynamicNumber("n2");
        int n3 = (int) getDynamicNumber("n3");
        int n4 = (int) getDynamicNumber("n4");

        double r1 = (double) getDynamicNumber("r1");
        double r2 = (double) getDynamicNumber("r2");
        double r3 = (float) getDynamicNumber("r3");
        double r4 = (float) getDynamicNumber("r4");

        int mr1 = (int) getDynamicNumber("mr1");
        int mr2 = (int) getDynamicNumber("mr2");

        printLiteralVariables(n1);
        printLiteralVariables(n2);
        printLiteralVariables(n3);
        printLiteralVariables(n4);

        printLiteralVariables(r1);
        printLiteralVariables(r2);
        printLiteralVariables(r3);
        printLiteralVariables(r4);

        printLiteralVariables(mr1);
        printLiteralVariables(mr2);
    }

    /**
     * Prints the variables and its Java type
     */
    private static void printLiteralVariables(Number n) {
        System.out.println(n + " is of " + ((Object) n).getClass().getName() + " type");
    }
}
