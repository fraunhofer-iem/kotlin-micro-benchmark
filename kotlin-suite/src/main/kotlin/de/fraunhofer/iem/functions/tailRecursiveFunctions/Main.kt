package de.fraunhofer.iem.functions.tailRecursiveFunctions

import kotlin.math.abs
import kotlin.math.cos

/**
 * Demonstrates the tail recursive function in Kotlin
 *
 * Note:
 * 1. This example is taken from https://kotlinlang.org/docs/functions.html#tail-recursive-functions
 *
 * @author Ranjith Krishnamurthy
 */
const val eps = 1E-10 // "good enough", could be 10^-15

tailrec fun findFixPoint(x: Double): Double =
    if (abs(x - cos(x)) < eps)
        x
    else
        findFixPoint(cos(x))

tailrec fun recPrint(name: String, greet: String, count: Int): String {
    if (count == 0)
        return "$greet $name"

    println("Inside tailrec = $greet $name")
    return recPrint(name, greet, count - 1)
}

fun main() {
    println(findFixPoint(20.0))
    println(recPrint("Ranjith", "Hello", 10))
}