package de.fraunhofer.iem.basics.controlFlow.returnsAndJumps;

/**
 * Demonstrates labelled break statement in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaLabelledBreak {
    /**
     * Demonstrates labelled break in single for loop in Java
     */
    private static void singleLoopLabelledBreak(int range) {
        loop1:
        for (int i = 0; i < range; ++i) {
            if (i == 5)
                break loop1;

            System.out.println(i);
        }
    }

    /**
     * Demonstrates two labelled break statements in double for loop in Java
     */
    private static void doubleLoopLabelledBreak(int range) {
        loop1:
        for (int i = 0; i < range; ++i) {
            if (i == 5)
                break loop1;

            loop2:
            for (int j = 0; j < range; ++j) {
                if (j % 2 != 0)
                    break loop1;

                System.out.println(i + " --> " + j);
            }
        }
    }

    /**
     * Demonstrates single labelled break statement in double for loop in Java
     */
    private static void doubleLoopSingleLabelledBreak(int range) {
        loop:
        for (int i = 0; i < range; ++i) {
            for (int j = 0; j < range; ++j) {
                if (j % 2 != 0)
                    break loop;

                System.out.println(i + " --> " + j);
            }
        }
    }

    public static void main(String[] args) {
        singleLoopLabelledBreak(50);
        doubleLoopLabelledBreak(5);
        doubleLoopSingleLabelledBreak(5);
    }
}
