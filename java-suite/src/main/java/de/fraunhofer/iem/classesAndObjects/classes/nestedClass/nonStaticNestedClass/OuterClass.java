package de.fraunhofer.iem.classesAndObjects.classes.nestedClass.nonStaticNestedClass;

/**
 * Demonstrates the non-static nested class in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class OuterClass {
    private int outerFlag = 110;

    public void printAll() {
        System.out.println(new InnerClass().innerFlag);
        System.out.println(outerFlag);
    }

    public class InnerClass {
        private int innerFlag = 23421;

        public void printAll() {
            System.out.println(this.innerFlag);
            System.out.println(OuterClass.this.outerFlag);
        }
    }
}
