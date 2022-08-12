package de.fraunhofer.iem.classesAndObjects.interfaceInKotlin.resolvingOverridingConflicts

/**
 * Example taken from https://kotlinlang.org/docs/interfaces.html#resolving-overriding-conflicts
 */
interface B {
    fun foo() {
        println("B --> foo")
    }

    fun bar() {
        println("B --> bar")
    }
}