package de.fraunhofer.iem.classesAndObjects.classes.nestedClass.staticNestedClass;

/**
 * Demonstrates the usage of the static nested class in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.printAll();

        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.printAll();
    }
}
