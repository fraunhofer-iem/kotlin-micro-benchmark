package de.fraunhofer.iem.uniqueToKotlin.properties.compileTimeConstants

/**
 * Demonstrates the compile time const in Kotlin.
 *
 * see: https://kotlinlang.org/docs/properties.html#compile-time-constants
 *
 * @author Ranjith Krishnamurthy
 */
const val appName: String = "MyApp"

fun main() {
    println(appName)
}