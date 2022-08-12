package de.fraunhofer.iem.functions.varargInFunctionParam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates the vararg in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    /**
     * Demonstrates the vararg on string in Java
     */
    private static void print(String... messages) {
        for (String message : messages) {
            System.out.println(message);
        }
    }

    /**
     * Demonstrates the vararg on List in Java
     */
    private static void printList(List<String>... lst) {
        for (List<String> ls : lst) {
            for (String elem : ls) {
                System.out.println(elem);
            }
        }
    }

    public static void main(String[] args) {
        print();
        print("Hello", "How are you");
        print("Hello", "How are you", "Where are you");

        printList(
                Arrays.asList("Hello", "How are you", "Where are you"),
                Arrays.asList("Hello", "How are you"),
                Collections.singletonList("Where are you")
        );
    }
}
