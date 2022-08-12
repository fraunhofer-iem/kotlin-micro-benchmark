package de.fraunhofer.iem.basics.JavaOperators;

/**
 * Demonstrates Logical operators in Java
 * <p>
 * In Java bytecode it uses logics
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaLogicalOperators {
    public static void main(String[] args) {
        boolean temp1 = JavaUnaryOperators.getBool("bool");
        boolean temp2 = JavaUnaryOperators.getBool("non bool");
        boolean temp3 = JavaUnaryOperators.getBool("non bool");
        boolean temp4 = JavaUnaryOperators.getBool("non bool");

        System.out.println(temp1 && temp2);
        System.out.println(temp3 || temp4);
        System.out.println(!temp2);
    }
}