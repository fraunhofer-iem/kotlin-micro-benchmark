package de.fraunhofer.iem.basics.variables;

import java.util.Scanner;

/**
 * Demonstrates the variables in Java.
 * <p>
 * Note: In byte code variable and final variable both are same. Keyword final is just a keyword for a compiler to know
 * that it is not allowed to update.
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaVariables {
    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int variable = getVariableValue();
        final float constant = getPiValue();

        variable += 10;
        System.out.println(variable);
        System.out.println(constant);
    }

    /**
     * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
     */
    public static int getVariableValue() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some input: ");
        if (scanner.nextLine().equals("y"))
            return 10;

        return 20;
    }

    /**
     * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
     */
    public static float getPiValue() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some input: ");
        if (scanner.nextLine().equals("2"))
            return 3.14F;

        return 3.141592F;
    }
}
