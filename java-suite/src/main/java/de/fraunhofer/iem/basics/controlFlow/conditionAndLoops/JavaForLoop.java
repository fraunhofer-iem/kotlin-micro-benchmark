package de.fraunhofer.iem.basics.controlFlow.conditionAndLoops;

/**
 * Demonstrates for loop in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaForLoop {
    public static void main(String[] args) {
        simpleFor(args);
        forEachLoop(args);
    }

    /**
     * Simple for loop
     */
    private static void simpleFor(String[] args) {
        for (int i = 0; i < args.length; ++i) {
            System.out.println(i + " --> " + args[i]);
        }
    }

    /**
     * for each loop
     */
    private static void forEachLoop(String[] args) {
        for (String elem : args) {
            System.out.println(elem);
        }
    }
}
