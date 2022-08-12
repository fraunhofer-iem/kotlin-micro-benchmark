package de.fraunhofer.iem.basics.kotlinOperators

/**
 * Demonstrates the Bitwise operators in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val a: Int = getInt("int")

    println(a.shl(2))
    println(a.shr(2))
    println(a.ushr(2))
    println(a.and(2))
    println(a.or(2))
    println(a.xor(2))
    println(a.inv())
}