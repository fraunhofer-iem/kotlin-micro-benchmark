package de.fraunhofer.iem.classesAndObjects.interfaceInJava.resolvingOverridingConflicts;

/**
 * Example taken from https://kotlinlang.org/docs/interfaces.html#resolving-overriding-conflicts
 */
public class C implements A {
    @Override
    public void bar() {
        System.out.println("C --> bar");
    }
}
