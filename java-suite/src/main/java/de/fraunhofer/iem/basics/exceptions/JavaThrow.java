package de.fraunhofer.iem.basics.exceptions;

/**
 * Demonstrates the throw statement in Java
 * <p>
 * Note: In Java exceptions are checked, that means either we have to catch the exception or
 * throw it to the called function.
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaThrow {
    /**
     * Exceptions from the checkValid is thrown from the main method coz in Java its checked exception
     */
    public static void main(String[] args) throws Exception {
        checkValid("Ranjith");
        checkValid("ranj345n");
    }

    /**
     * Throws a Exception
     */
    private static void checkValid(
            String name) throws Exception {
        if (name.matches(".*\\d.*")) {
            throw new Exception("Invalid name");
        }
    }
}
