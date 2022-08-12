package de.fraunhofer.iem.classesAndObjects.interfaceInJava.resolvingOverridingConflicts;

/**
 * Example taken from https://kotlinlang.org/docs/interfaces.html#resolving-overriding-conflicts
 */
public class D implements A, B {
    @Override
    public void foo() {
        A.super.foo();
        B.super.foo();
    }

    @Override
    public void bar() {
        B.super.bar();
    }
}
