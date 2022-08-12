package de.fraunhofer.iem.classesAndObjects.classes.nestedClass.nonStaticNestedClass;

/**
 * Demonstrates the usage of the non-static nested class in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.printAll();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.printAll();
    }
}
