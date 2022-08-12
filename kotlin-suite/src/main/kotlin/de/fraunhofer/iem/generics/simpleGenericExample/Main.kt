package de.fraunhofer.iem.generics.simpleGenericExample

/**
 * demonstrates the usage of generics in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val pair = CustomPair(20, 30)
    println(pair.first)
    println(pair.second)

    val secondPair: CustomPair<String> = CustomPair("Ranjith", "K")
    println(secondPair.first)
    println(secondPair.second)
}