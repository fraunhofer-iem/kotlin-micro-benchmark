package de.fraunhofer.iem.basics.controlFlow.conditionAndLoops;

/**
 * Demonstrates the do while loop in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaDoWhileLoop {
    public static void main(String[] args) {
        doWhileExample(0);
        doWhileExample(5);
        doWhileExample(15);
    }

    private static void doWhileExample(int end) {
        do {
            System.out.println(end);
            ++end;
        } while (end < 10);
    }
}
