package de.fraunhofer.iem.functions.simpleExample;

/**
 * Demonstrates the functions in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    /**
     * Demonstrates the usage of the functions in Java
     */
    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add10(10, 20));

        System.out.println(add(1123, 223));
        System.out.println(add10(1123, 223));
    }

    /**
     * Demonstrates the public static function in Java
     */
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Demonstrate the private static function in Java
     */
    private static float add10(int num1, int num2) {
        return ((float) num1) + num2 + 10;
    }
}
