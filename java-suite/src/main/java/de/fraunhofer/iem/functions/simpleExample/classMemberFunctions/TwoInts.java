package de.fraunhofer.iem.functions.simpleExample.classMemberFunctions;

/**
 * Demonstrates the non-static member functions in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class TwoInts {
    /**
     * Demonstrates the public non-static member function in Java
     */
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Demonstrate the private non-static member function in Java
     */
    private float add10(int num1, int num2) {
        return ((float) num1) + num2 + 10;
    }

    public float publicAdd10(int num1, int num2) {
        return add10(num1, num2);
    }
}
