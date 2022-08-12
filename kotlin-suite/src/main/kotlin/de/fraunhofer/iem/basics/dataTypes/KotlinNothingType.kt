package de.fraunhofer.iem.basics.dataTypes

/**
 * Demonstrates the Nothing type in Kotlin
 *
 * This type is just to inform compiler that the function returns nothing and it always throws an exception.
 * So that compile will know the dead code.
 *
 * see: https://kotlinlang.org/docs/exceptions.html#the-nothing-type
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    println("Start")

    try {
        val sum = dummy1()

        println("Still inside try sum = $sum")
    } catch (ex: Exception) {
        println("Caught for dummy1")
    }

    try {
        val sum = dummy2()

        println("Still inside try sum = $sum")
    } catch (ex: Exception) {
        println("Caught for dummy2")
    }

    println("End")
}

/**
 * Returns Nothing i.e. it always throws exception
 */
fun dummy1(): Nothing {
    throw Exception("")
}

/**
 * Returns Nothing? i.e. it always throws exception
 */
fun dummy2(): Nothing? {
    throw Exception("")
}