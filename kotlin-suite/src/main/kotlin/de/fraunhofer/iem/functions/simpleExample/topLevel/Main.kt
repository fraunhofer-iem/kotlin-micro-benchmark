package de.fraunhofer.iem.functions.simpleExample.topLevel

/**
 * Demonstrate the public top level function in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

/**
 * Demonstrate the private top level function in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun add10(num1: Int, num2: Int): Float {
    return num1.toFloat() + num2 + 10
}

/**
 * Demonstrate internal top level single-expression function in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
internal fun sub(num1: Int, num2: Int) = num1 - num2

/**
 * Demonstrate the usage of the functions in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    println(add(10, 20))
    println(add10(10, 20))

    println(add(1123, 223))
    println(add10(1123, 223))

    println(sub(10, 20))
    println(sub(1123, 223))
}