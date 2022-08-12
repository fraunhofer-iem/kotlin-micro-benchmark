package de.fraunhofer.iem.basics.kotlinOperators

/**
 * Demonstrates the Kotlin assignment operator
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val num1: Int = getInt("int")

    var res1 = 0

    res1 += num1
    println(res1)

    res1 -= num1
    println(res1)

    res1 += num1
    println(res1)

    res1 *= num1
    println(res1)

    res1 /= num1
    println(res1)

    res1 %= num1
    println(res1)

    res1 = num1
    println(res1)
}