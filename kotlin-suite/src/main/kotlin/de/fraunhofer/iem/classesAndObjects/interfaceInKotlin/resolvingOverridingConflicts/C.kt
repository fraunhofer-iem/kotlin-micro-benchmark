package de.fraunhofer.iem.classesAndObjects.interfaceInKotlin.resolvingOverridingConflicts

/**
 * Example taken from https://kotlinlang.org/docs/interfaces.html#resolving-overriding-conflicts
 */
class C : A {
    override fun bar() {
        println("C --> bar")
    }
}