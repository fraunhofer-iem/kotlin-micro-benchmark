package de.fraunhofer.iem.classesAndObjects.interfaceInJava.resolvingOverridingConflicts;

/**
 * Example taken from https://kotlinlang.org/docs/interfaces.html#resolving-overriding-conflicts
 */
public interface A {
    default public void foo() {
        System.out.println("A --> foo");
    }

    public void bar();
}
