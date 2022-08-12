package de.fraunhofer.iem.basics.dataTypes;

import java.util.Scanner;

/**
 * Demonstrates the String in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaStringType {
    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        String rawStr = getString();

        System.out.println(rawStr);
    }

    /**
     * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
     */
    private static String getString() {
        String str1 = "Hi, How are you?\nWelcome to Java\n";
        String str2 = "Welcome to Java!!\nHow are you doing\n";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some input: ");
        if (scanner.nextLine().equals("2"))
            return str1;

        return str2;
    }
}
