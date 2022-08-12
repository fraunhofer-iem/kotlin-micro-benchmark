package de.fraunhofer.iem.basics.JavaOperators;

/**
 * Demonstrates the Unary operators in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaUnaryOperators {
    public static void main(String[] args) {
        int num = JavaComparisonOperators.getInt("int");

        boolean flag = getBool("bool");

        System.out.println(+num);
        System.out.println(-num);
        System.out.println(++num);
        System.out.println(--num);
        System.out.println(num++);
        System.out.println(num--);
        System.out.println(num);
        System.out.println(!flag);
    }

    /**
     * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
     */
    public static boolean getBool(String flag) {
        return flag.equals("bool");
    }
}