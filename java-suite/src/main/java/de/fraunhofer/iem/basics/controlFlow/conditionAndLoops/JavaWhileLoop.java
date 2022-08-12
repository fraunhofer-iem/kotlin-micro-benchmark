package de.fraunhofer.iem.basics.controlFlow.conditionAndLoops;

/**
 * Demonstrates the while loop in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaWhileLoop {
    public static void main(String[] args) {
        whileExample(0);
        whileExample(5);
        whileExample(15);
    }

    private static void whileExample(int end) {
        while (end < 10) {
            System.out.println(end);
            ++end;
        }
    }
}
