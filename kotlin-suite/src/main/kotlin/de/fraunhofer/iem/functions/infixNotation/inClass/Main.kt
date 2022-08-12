package de.fraunhofer.iem.functions.infixNotation.inClass

/**
 * Demonstrate the usage of the infix function in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val num1 = MyInt(10)
    val num2 = MyInt(30)

    val sum = num1 add num2
    val sub = num1 sub num2

    println(sum.number)
    println(sub.number)
}