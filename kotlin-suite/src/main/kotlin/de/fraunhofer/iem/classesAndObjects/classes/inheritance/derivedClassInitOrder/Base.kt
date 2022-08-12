package de.fraunhofer.iem.classesAndObjects.classes.inheritance.derivedClassInitOrder

/**
 * Example taken from the https://kotlinlang.org/docs/inheritance.html#derived-class-initialization-order
 *
 * Demonstrates the order of the derived class initialization
 */
open class Base(val name: String) {

    init {
        println("Initializing a base class")
    }

    open val size: Int =
        name.length.also { println("Initializing size in the base class: $it") }
}