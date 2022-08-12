package de.fraunhofer.iem.classesAndObjects.interfaceInKotlin.resolvingOverridingConflicts

/**
 * Example taken from https://kotlinlang.org/docs/interfaces.html#resolving-overriding-conflicts
 */
interface A {
    fun foo() {
        println("A --> foo")
    }

    fun bar()
}