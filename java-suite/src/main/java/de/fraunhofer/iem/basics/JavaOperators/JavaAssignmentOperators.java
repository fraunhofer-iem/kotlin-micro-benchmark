package de.fraunhofer.iem.basics.JavaOperators;

/**
 * Demonstrates the Java assignment operator
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaAssignmentOperators {
    public static void main(String[] args) {
        int num1 = JavaComparisonOperators.getInt("int");

        int res1 = 0;

        res1 += num1;
        System.out.println(res1);

        res1 -= num1;
        System.out.println(res1);

        res1 += num1;
        System.out.println(res1);

        res1 *= num1;
        System.out.println(res1);

        res1 /= num1;
        System.out.println(res1);

        res1 %= num1;
        System.out.println(res1);

        res1 = num1;
        System.out.println(res1);
    }
}
