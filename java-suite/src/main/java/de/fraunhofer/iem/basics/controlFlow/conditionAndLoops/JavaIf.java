package de.fraunhofer.iem.basics.controlFlow.conditionAndLoops;

/**
 * Demonstrates If conditions in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaIf {
    public static void main(String[] args) {
        System.out.println("*** max1 with traditional if condition = " + max1(20, 85));
        System.out.println("*** max1 with traditional if condition = " + max1(974, 1));
        System.out.println("*** max2 with traditional if else condition = " + max2(20, 85));
        System.out.println("*** max2 with traditional if else condition = " + max2(974, 1));
        System.out.println("*** max5 with nested if condition = " + max3(20, 85, 0));
        System.out.println("*** max5 with nested if condition = " + max3(974, 1, 1));
        System.out.println("*** sign with if else if ladder condition = " + sign(-20));
        System.out.println("*** sign with if else if ladder condition = " + sign(974));
    }

    /**
     * Demonstrates the traditional if condition in Java
     *
     * @author Ranjith Krishnamurthy
     */
    private static int max1(int num1, int num2) {
        int max = num1;

        if (num1 < num2) {
            max = num2;
        }

        return max;
    }

    /**
     * Demonstrates the traditional if else condition in Java
     *
     * @author Ranjith Krishnamurthy
     */
    private static int max2(int num1, int num2) {
        int max;

        if (num1 < num2) {
            max = num2;
        } else {
            max = num1;
        }

        return max;
    }

    /**
     * Demonstrates the nested if condition in Java
     *
     * @author Ranjith Krishnamurthy
     */
    private static int max3(int num1, int num2, int num3) {
        int max;

        if (num1 < num2) {
            if (num1 > num3) {
                max = num1;
            } else {
                max = num3;
            }
        } else if (num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }

        return max;
    }

    /**
     * Demonstrates the if else if ladder condition in Java
     *
     * @author Ranjith Krishnamurthy
     */
    private static String sign(int num) {
        char sign;

        if (num > 0) {
            System.out.println(num + " is positive");
            sign = '+';
        } else if (num < 0) {
            System.out.println(num + " is negative");
            sign = '-';
        } else {
            System.out.println(num + " is Zero");
            sign = '0';
        }

        return sign + Integer.toString(num);
    }
}
