package de.fraunhofer.iem.classesAndObjects.classes.nestedClass.staticNestedClass;

/**
 * Demonstrates the static nested class in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class OuterClass {
    private int outerFlag = 110;

    public void printAll() {
        System.out.println(new InnerClass().innerFlag);
        System.out.println(outerFlag);
    }

    public static class InnerClass {
        private int innerFlag = 23421;

        public void printAll() {
            System.out.println(innerFlag);
        }
    }
}
