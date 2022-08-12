package de.fraunhofer.iem.basics.controlFlow.returnsAndJumps;

import java.util.ArrayList;

/**
 * Demonstrates return statement in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaReturn {
    public static void main(String[] args) {
        returnNothing(0);
        System.out.println(returnObject(1));
        System.out.println(returnValue(1251));
        returnInLambda();
        System.out.println("Ending Main");  
    }

    /**
     * Demonstrates the return void in Java
     */
    private static void returnNothing(int num) {
        if (num == 0)
            return;

        if (num > 10)
            System.out.println("Greater than 10");

        if (num < 100)
            return;

        if (num > 1000)
            System.out.println("Greater than 1000");
    }

    /**
     * Demonstrates the return value (in Java bytecode primitive values) in Java
     */
    private static int returnValue(int num) {
        if (num == 0)
            return -1;

        if (num > 10)
            System.out.println("Greater than 10");

        if (num < 100)
            return -100;

        if (num > 1000)
            System.out.println("Greater than 1000");

        return 404;
    }

    /**
     * Demonstrates the return Object in Java
     */
    private static String returnObject(int num) {
        if (num == 0)
            return "-1";

        if (num > 10)
            System.out.println("Greater than 10");

        if (num < 100)
            return "-100";

        if (num > 1000)
            System.out.println("Greater than 1000");

        return "404";
    }

    /**
     * Demonstrates the return statement in Lambda expression
     */
    private static void returnInLambda() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> {
            System.out.println(n);

            if (n % 2 == 0)
                return; // return to the caller of this lambda expression

            System.out.println("Welcome to Lambda");
        } );
    }
}
