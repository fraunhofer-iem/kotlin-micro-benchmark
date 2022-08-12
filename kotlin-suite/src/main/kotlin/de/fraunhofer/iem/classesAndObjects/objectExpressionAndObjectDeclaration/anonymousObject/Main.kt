package de.fraunhofer.iem.classesAndObjects.objectExpressionAndObjectDeclaration.anonymousObject

/**
 * Demonstrates the anonymous objects in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val outerName: String = "Kotlin"

    // Anonymous object with properties
    val any1 = object {
        val greet: String = "Hello!!! "
        val name: String = "Ranjith"

        @Override
        override fun toString(): String {
            return "$greet$name"
        }
    }

    printAnonymousObject(any1)

    // Anonymous object with property and accessing the outer class property
    val any2 = object {
        val greet: String = "Hello!!! "

        @Override
        override fun toString(): String {
            return "$greet$outerName"
        }
    }

    printAnonymousObject(any2)

    // Simple anonymous object without any additional features
    val any3 = object {
    }

    printAnonymousObject(any3)
}

/**
 * Demonstrates the usage of the anonymous object in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun printAnonymousObject(any: Any) {
    println(any)
}