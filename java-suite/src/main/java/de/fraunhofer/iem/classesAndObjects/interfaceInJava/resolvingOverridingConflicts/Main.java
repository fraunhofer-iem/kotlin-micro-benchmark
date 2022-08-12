package de.fraunhofer.iem.classesAndObjects.interfaceInJava.resolvingOverridingConflicts;

/**
 * Demonstrates how Java resolves the inheritance conflicts
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.foo();
        c.bar();

        D d = new D();
        d.foo();
        d.bar();
    }
}
