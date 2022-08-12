package de.fraunhofer.iem.basics.exceptions;

/**
 * Demonstrates the try catch statement in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class JavaTryCatchFinally {
    /**
     * Demonstrates the double catch block
     */
    private static void tryCatchExample1() {
        try {
            checkValid1("Ranjith");
            checkValid2("ranj345n");
        } catch (NoSuchFieldException exception) {
            System.out.println("Something went wrong in tryCatchExample1 (NoSuchFieldException)");
        } catch (NoSuchMethodException exception) {
            System.out.println("Something went wrong in tryCatchExample1 (NoSuchMethodException)");
        }
    }

    /**
     * Demonstrates the single catch block
     */
    private static void tryCatchExample2() {
        try {
            checkValid1("Ranjith");
            checkValid1("ranj345n");
        } catch (NoSuchFieldException exception) {
            System.out.println("Something went wrong in tryCatchExample2 (NoSuchFieldException)");
        }
    }

    /**
     * Demonstrates the catch with finally block
     */
    private static void tryCatchExample3() {
        try {
            checkValid1("Ranjith");
            checkValid2("ranj345n");
        } catch (NoSuchFieldException exception) {
            System.out.println("Something went wrong in tryCatchExample3 (NoSuchFieldException)");
        } catch (NoSuchMethodException exception) {
            System.out.println("Something went wrong in tryCatchExample3 (NoSuchMethodException)");
        } finally {
            System.out.println("Finally executed in tryCatchExample3");
        }
    }

    /**
     * Throws a NoSuchFieldException (Just for example)
     */
    private static void checkValid1(String name) throws NoSuchFieldException {
        if (name.matches(".*\\d.*")) {
            throw new NoSuchFieldException("Invalid name");
        }
    }

    /**
     * Throws a NoSuchMethodException (Just for example)
     */
    private static void checkValid2(String name) throws NoSuchMethodException {
        if (name.matches(".*\\d.*")) {
            throw new NoSuchMethodException("Invalid name");
        }
    }

    public static void main(String[] args) {
        tryCatchExample1();
        tryCatchExample2();
        tryCatchExample3();
    }
}
