package de.fraunhofer.iem.generics.upperBounds.inGenericClass

/**
 * demonstrates the usage of upper bounds in generics in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val pair = CustomPair(20, "Ranjith")
    println(pair.first)
    println(pair.second)
}