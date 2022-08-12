package de.fraunhofer.iem.classesAndObjects.interfaceInKotlin.resolvingOverridingConflicts

/**
 * Demonstrates how Java resolves the inheritance conflicts
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val c = C()
    c.foo()
    c.bar()
    val d = D()
    d.foo()
    d.bar()
}