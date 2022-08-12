package de.fraunhofer.iem.basics.JavaOperators;

/**
 * Demonstrates the Comparison operators in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaComparisonOperators {
    public static void main(String[] args) {
        int num1 = getInt("int");
        int num2 = getInt("int");

        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);

        double num3 = getDouble("double");
        double num4 = getDouble("double");

        System.out.println(num3 > num4);
        System.out.println(num3 < num4);
        System.out.println(num3 >= num4);
        System.out.println(num3 <= num4);
        System.out.println(num3 == num4);
        System.out.println(num3 != num4);

        dummy(102, 2020);
    }

    /**
     * Demonstrates the comparison operator on Object
     *
     * @param num1 Object1
     * @param num2 Object2
     */
    private static void dummy(Object num1, Object num2) {
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);

        // For below its not supported for Object type
        // System.out.println(num1 > num2);
        // System.out.println(num1 < num2);
        // System.out.println(num1 >= num2);
        // System.out.println(num1 <= num2);
    }

    /**
     * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
     */
    public static double getDouble(String str) {
        if (str.equals("int")) {
            return 50.20;
        }

        return 150.50;
    }

    /**
     * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
     */
    public static int getInt(String str) {
        if (str.equals("int")) {
            return 50;
        }

        return 150;
    }
}