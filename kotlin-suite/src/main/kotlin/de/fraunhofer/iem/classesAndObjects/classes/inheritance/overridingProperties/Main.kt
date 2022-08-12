package de.fraunhofer.iem.classesAndObjects.classes.inheritance.overridingProperties

/**
 * Demonstrates the overriding properties in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    printProp(Base("Base Property"))
    printProp(Derived("Derived property"))
}

private fun printProp(base: Base) {
    println(base.prop)
    println(base.num)
    println(base.ch)
}