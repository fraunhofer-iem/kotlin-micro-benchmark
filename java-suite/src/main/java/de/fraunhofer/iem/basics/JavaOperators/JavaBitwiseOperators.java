package de.fraunhofer.iem.basics.JavaOperators;

/**
 * Demonstrates the Bitwise operators in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaBitwiseOperators {
    public static void main(String[] args) {
        int a = JavaComparisonOperators.getInt("int");

        System.out.println(a << 2);
        System.out.println(a >> 2);
        System.out.println(a >>> 2);
        System.out.println(a & 2);
        System.out.println(a | 2);
        System.out.println(a ^ 2);
        System.out.println(~a);

    }
}
