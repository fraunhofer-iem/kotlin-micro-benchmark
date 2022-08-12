package de.fraunhofer.iem.basics.kotlinOperators

/**
 * Demonstrates the Unary operators in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    var num: Int = getInt("int")
    val flag: Boolean = getBool("bool")

    println(+num)
    println(-num)
    println(++num)
    println(--num)
    println(num++)
    println(num--)
    println(num)
    println(!flag)
}

/**
 * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
 */
fun getBool(flag: String): Boolean {
    return flag == "bool"
}