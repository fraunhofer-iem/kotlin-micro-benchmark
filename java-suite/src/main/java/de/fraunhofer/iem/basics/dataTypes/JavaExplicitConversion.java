package de.fraunhofer.iem.basics.dataTypes;

/**
 * Demonstrates the explicit conversion of type in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaExplicitConversion {
    public static void main(String[] args) {
        byte num1 = JavaDataTypes1.getNumber("byte").byteValue();
        short num2 = JavaDataTypes1.getNumber("short").shortValue();
        int num3 = JavaDataTypes1.getNumber("int").intValue();
        long num4 = JavaDataTypes1.getNumber("long").longValue();
        float num5 = JavaDataTypes1.getNumber("float").floatValue();
        double num6 = JavaDataTypes1.getNumber("double").doubleValue();

        int dup1 = (int) JavaDataTypes1.getNumber("what").doubleValue();
        double dup2 = (double) JavaDataTypes1.getNumber("what").intValue();

        System.out.println(num1 + " : " + num2 + " : " + num3 + " : " + num4 + " : " +
                num5 + " : " + num6 + " : " + dup1 + " : " + dup2);
    }
}
