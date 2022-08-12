package de.fraunhofer.iem.uniqueToKotlin.extensions.extensionProperties

/**
 * Demonstrates the extension properties in Kotlin
 *
 * see: https://kotlinlang.org/docs/extensions.html#extension-properties
 *
 * @author Ranjith Krishnamurthy
 */
val <T> MutableList<T>.lastIndex: Int
    get() {
        return this.size - 1
    }

/**
 * Demonstrates the usage of the extension properties
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val list = mutableListOf<Int>(23342, 34, 928345798, 2, 1, 0, 23423, 2, 423, 9123)

    println("Last index of the list is ${list.lastIndex}")
}