package de.fraunhofer.iem.basics.controlFlow.returnsAndJumps;

/**
 * Demonstrates labelled continue statement in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaLabelledContinue {
    /**
     * Demonstrates labelled continue in single for loop in Java
     */
    private static void singleLoopLabelledContinue(int range) {
        loop1:
        for (int i = 0; i < range; ++i) {
            if (i % 2 == 0)
                continue loop1;

            System.out.println(i);
        }
    }

    /**
     * Demonstrates two labelled continue statements in double for loop in Java
     */
    private static void doubleLoopLabelledContinue(int range) {
        loop1:
        for (int i = 0; i < range; ++i) {
            if (i % 2 == 0)
                continue loop1;

            loop2:
            for (int j = 0; j < range; ++j) {
                if (j % 2 != 0)
                    continue loop1;

                System.out.println(i + " --> " + j);
            }
        }
    }

    /**
     * Demonstrates single labelled continue statement in double for loop in Java
     */
    private static void doubleLoopSingleLabelledContinue(int range) {
        loop:
        for (int i = 0; i < range; ++i) {
            for (int j = 0; j < range; ++j) {
                if (j % 2 != 0)
                    continue loop;

                System.out.println(i + " --> " + j);
            }
        }
    }

    public static void main(String[] args) {
        singleLoopLabelledContinue(50);
        doubleLoopLabelledContinue(5);
        doubleLoopSingleLabelledContinue(5);
    }
}
