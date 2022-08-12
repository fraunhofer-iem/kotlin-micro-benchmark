package de.fraunhofer.iem.classesAndObjects.anonymousClass.anonymousClassOfObject;

/**
 * Demonstrates the anonymous class in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static void main(String[] args) {
        String outerName = "Kotlin";

        // Anonymous class with fields
        Object object1 = new Object() {
            public final String greet = "Hello!!! ";
            public final String name = "Ranjith";

            @Override
            public String toString() {
                return greet + name;
            }
        };

        printAnonymousObject(object1);

        // Anonymous class with field and accessing the outer class field
        Object object2 = new Object() {
            public final String greet = "Hello!!! ";

            @Override
            public String toString() {
                return greet + outerName;
            }
        };

        printAnonymousObject(object2);

        // Simple anonymous class without any additional features
        Object object3 = new Object() {

        };

        printAnonymousObject(object3);
    }

    /**
     * Demonstrates the usage of the anonymous class in Java
     */
    private static void printAnonymousObject(Object object) {
        System.out.println(object);
    }
}
