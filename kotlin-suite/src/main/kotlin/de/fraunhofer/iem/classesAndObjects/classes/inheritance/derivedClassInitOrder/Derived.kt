package de.fraunhofer.iem.classesAndObjects.classes.inheritance.derivedClassInitOrder

/**
 * Example taken from the https://kotlinlang.org/docs/inheritance.html#derived-class-initialization-order
 *
 * Demonstrates the order of the derived class initialization
 */
class Derived(
    name: String,
    val lastName: String,
) : Base(name.replaceFirstChar { it.uppercase() }.also { println("Argument for the base class: $it") }) {

    init {
        println("Initializing a derived class")
    }

    override val size: Int =
        (super.size + lastName.length).also { println("Initializing size in the derived class: $it") }
}