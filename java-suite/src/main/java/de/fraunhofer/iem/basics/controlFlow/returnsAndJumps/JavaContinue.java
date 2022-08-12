package de.fraunhofer.iem.basics.controlFlow.returnsAndJumps;

/**
 * Demonstrates continue statement in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaContinue {
    /**
     * Demonstrates continue in single for loop in Java
     */
    private static void singleLoopContinue(int range) {
        for (int i = 0; i < range; ++i) {
            if (i % 2 == 0)
                continue;

            System.out.println(i);
        }
    }

    /**
     * Demonstrates two continue statements in double for loop in Java
     */
    private static void doubleLoopContinue(int range) {
        for (int i = 0; i < range; ++i) {
            if (i % 2 == 0)
                continue;

            for (int j = 0; j < range; ++j) {
                if (j % 2 != 0)
                    continue;

                System.out.println(i + " --> " + j);
            }
        }
    }

    /**
     * Demonstrates single continue statement in double for loop in Java
     */
    private static void doubleLoopSingleContinue(int range) {
        for (int i = 0; i < range; ++i) {
            for (int j = 0; j < range; ++j) {
                if (j % 2 != 0)
                    continue;

                System.out.println(i + " --> " + j);
            }
        }
    }

    public static void main(String[] args) {
        singleLoopContinue(50);
        doubleLoopContinue(5);
        doubleLoopSingleContinue(5);
    }
}
