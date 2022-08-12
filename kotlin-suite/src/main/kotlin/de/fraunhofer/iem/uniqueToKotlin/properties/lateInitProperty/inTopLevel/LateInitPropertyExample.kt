package de.fraunhofer.iem.uniqueToKotlin.properties.lateInitProperty.inTopLevel

/**
 * Demonstrates the lateinit in top level
 *
 * @author Ranjith Krishnamurthy
 */
lateinit var name: String

fun main() {
    if (::name.isInitialized) {
        println(name)
    } else {
        println("name")
    }
}