package de.fraunhofer.iem.basics.dataTypes;

import java.io.File;

/**
 * Demonstrates Char in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaChar {
    public static void main(String[] args) {
        char ch1 = File.pathSeparatorChar;
        Character ch2 = File.separatorChar;

        System.out.println(ch1);
        System.out.println(ch2);

        char ch3 = '5';
        System.out.println(Character.getNumericValue(ch3));
    }
}