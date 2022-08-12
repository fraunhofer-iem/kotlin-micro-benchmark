package de.fraunhofer.iem.classesAndObjects.interfaceInJava.resolvingOverridingConflicts;

/**
 * Example taken from https://kotlinlang.org/docs/interfaces.html#resolving-overriding-conflicts
 */
public interface B {
    default public void foo() {
        System.out.println("B --> foo");
    }

    default public void bar() {
        System.out.println("B --> bar");
    }
}
