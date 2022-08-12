package de.fraunhofer.iem.basics.dataTypes;

import static java.lang.System.out;

/**
 * Demonstrates the Java array
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaArray {
    public static void main(String[] args) {
        Object[] arr1 = {1, "ranjith", 'r', 5454.5151, 55F, 65446L};
        out.println(arr1);

        int[] arr2 = {1, 2, 3, 4, 5};
        out.println(arr2);

        char[] arr3 = {'r', 'a', 'n', 'j', 'i', 't', 'h'};
        out.println(arr3);

        Integer[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (Integer elem : arr4) {
            out.println(elem);
        }
    }
}
