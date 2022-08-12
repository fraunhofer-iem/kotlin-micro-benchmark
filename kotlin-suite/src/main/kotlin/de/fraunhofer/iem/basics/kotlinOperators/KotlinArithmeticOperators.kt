package de.fraunhofer.iem.basics.kotlinOperators

/**
 * Demonstrates the Kotlin's Arithmetic operators
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val a: Int = 50
    val b: Double = 50.45

    val res1 = a + b
    println(res1)
    println(res1::class.simpleName)

    val res2 = a - b
    println(res2)
    println(res2::class.simpleName)

    val res3 = a * b
    println(res3)
    println(res3::class.simpleName)

    val res4 = a / b
    println(res4)
    println(res4::class.simpleName)

    val res5 = a % b
    println(res5)
    println(res5::class.simpleName)

    operatorMethod()
}

/**
 * Demonstrates the Kotlin arithmetic operators methods.
 *
 * @author Ranjith Krishnamurthy
 */
fun operatorMethod() {
    val a: Int = 50
    val b: Double = 50.45

    val res1 = a.plus(b)
    println(res1)
    println(res1::class.simpleName)

    val res2 = a.minus(b)
    println(res2)
    println(res2::class.simpleName)

    val res3 = a.times(b)
    println(res3)
    println(res3::class.simpleName)

    val res4 = a.div(b)
    println(res4)
    println(res4::class.simpleName)

    val res5 = a.mod(11)
    println(res5)
    println(res5::class.simpleName)

    val res6 = a.rem(b)
    println(res6)
    println(res6::class.simpleName)
}