package de.fraunhofer.iem.basics.dataTypes;

import java.io.File;

/**
 * Demonstrates the basic types in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaDataTypes1 {
    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        byte num1 = (byte) getNumber("byte");
        short num2 = (short) getNumber("short");
        int num3 = (int) getNumber("int");
        long num4 = (long) getNumber("long");
        float num5 = (float) getNumber("float");
        double num6 = (double) getNumber("double");

        char singleCharacter = getChar();
        boolean flag = Integer.TYPE.isPrimitive();

        String str = getString();

        System.out.println(num1 + " : " + num2 + " : " + num3 + " : " + num4 + " : " +
                num5 + " : " + num6 + " : " + singleCharacter + " : " + str + " : " + flag);
    }

    /**
     * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
     */
    public static char getChar() {
        return File.separatorChar;
    }

    /**
     * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
     */
    public static String getString() {
        return File.pathSeparator;
    }

    /**
     * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
     */
    public static Number getNumber(String type) {
        switch (type) {
            case "byte":
                return (byte) 1;
            case "short":
                return (short) 12;
            case "int":
                return (int) 10;
            case "long":
                return (long) 12342;
            case "float":
                return (float) 10.4F;
            case "double":
                return (double) 10.4;
        }
        return 0;
    }
}
