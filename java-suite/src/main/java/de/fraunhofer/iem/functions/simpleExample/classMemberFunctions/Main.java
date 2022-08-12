package de.fraunhofer.iem.functions.simpleExample.classMemberFunctions;

public class Main {
    /**
     * Demonstrates the usage of the non-static functions in Java
     */
    public static void main(String[] args) {
        TwoInts twoInts = new TwoInts();

        System.out.println(twoInts.add(10, 20));
        System.out.println(twoInts.publicAdd10(10, 20));

        System.out.println(twoInts.add(1123, 223));
        System.out.println(twoInts.publicAdd10(1123, 223));
    }
}
