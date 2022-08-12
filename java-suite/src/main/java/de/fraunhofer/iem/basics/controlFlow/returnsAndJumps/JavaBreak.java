package de.fraunhofer.iem.basics.controlFlow.returnsAndJumps;

/**
 * Demonstrates break statement in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaBreak {
    /**
     * Demonstrates break in single for loop in Java
     */
    private static void singleLoopBreak(int range) {
        for (int i = 0; i < range; ++i) {
            if (i == 5)
                break;

            System.out.println(i);
        }
    }

    /**
     * Demonstrates two break statements in double for loop in Java
     */
    private static void doubleLoopBreak(int range) {
        for (int i = 0; i < range; ++i) {
            if (i == 5)
                break;

            for (int j = 0; j < range; ++j) {
                if (j % 2 != 0)
                    break;

                System.out.println(i + " --> " + j);
            }
        }
    }

    /**
     * Demonstrates single break statement in double for loop in Java
     */
    private static void doubleLoopSingleBreak(int range) {
        for (int i = 0; i < range; ++i) {
            for (int j = 0; j < range; ++j) {
                if (j % 2 != 0)
                    break;

                System.out.println(i + " --> " + j);
            }
        }
    }

    public static void main(String[] args) {
        singleLoopBreak(50);
        doubleLoopBreak(5);
        doubleLoopSingleBreak(5);
    }
}
