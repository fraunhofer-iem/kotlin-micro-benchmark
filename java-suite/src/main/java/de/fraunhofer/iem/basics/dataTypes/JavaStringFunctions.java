package de.fraunhofer.iem.basics.dataTypes;

/**
 * Demonstrates the Java string inbuilt functions
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaStringFunctions {
    public static void main(String[] args) {
        String greet = "Hi Welcome!!!";

        System.out.println(greet.length());
        System.out.println(greet.charAt(0));
        System.out.println(greet.subSequence(2, 4));
        System.out.println(greet.compareTo("How are you"));
        System.out.println(greet.codePointAt(0));
        System.out.println(greet.toUpperCase());
        System.out.println(greet.trim());
    }
}
