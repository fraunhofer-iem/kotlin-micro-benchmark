package de.fraunhofer.iem.basics.controlFlow.conditionAndLoops

/**
 * Demonstrates if in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    println("*** max1 with traditional if condition = ${max1(20, 85)}")
    println("*** max1 with traditional if condition = ${max1(974, 1)}")
    println("*** max2 with traditional if else condition = ${max2(20, 85)}")
    println("*** max2 with traditional if else condition = ${max2(974, 1)}")
    println("*** max3 with simple if else expression with single statement = ${max3(20, 85)}")
    println("*** max3 with simple if else expression with single statement = ${max3(974, 1)}")
    println("*** max4 with if else expression with multiple statement = ${max4(20, 85)}")
    println("*** max4 with if else expression with multiple statement = ${max4(974, 1)}")
    println("*** max5 with nested if expression = ${max5(20, 85, 0)}")
    println("*** max5 with nested if expression = ${max5(974, 1, 1)}")
    println("*** sign with if else if ladder expression = ${sign(-20)}")
    println("*** sign with if else if ladder expression = ${sign(974)}")
}

/**
 * Demonstrates the traditional if condition in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun max1(num1: Int, num2: Int): Int {
    var max: Int = num1

    if (num1 < num2) {
        max = num2
    }

    return max
}

/**
 * Demonstrates the traditional if else condition in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun max2(num1: Int, num2: Int): Int {
    val max: Int

    if (num1 < num2) {
        max = num2
    } else {
        max = num1
    }

    return max
}

/**
 * Demonstrates the simple if else expression with single statement in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun max3(num1: Int, num2: Int): Int {
    return if (num1 < num2) num2 else num1
}

/**
 * Demonstrates the if else expression with multiple statements in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun max4(num1: Int, num2: Int): Int {

    return if (num1 < num2) {
        println("$num2 is greater than $num1")
        num2
    } else {
        println("$num1 is greater than $num2")
        num1
    }
}

/**
 * Demonstrates the nested if expression in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun max5(num1: Int, num2: Int, num3: Int): Int {
    return if (num1 > num2) {
        if (num1 > num3) {
            num1
        } else {
            num3
        }
    } else if (num2 > num3) {
        num2
    } else {
        num3
    }
}

/**
 * Demonstrates the if else if ladder expression in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun sign(num: Int): String {
    val sign: Char = if (num > 0) {
        println("$num is positive")
        '+'
    } else if (num < 0) {
        println("$num is negative")
        '-'
    } else {
        println("$num is Zero")
        '0'
    }

    return sign + num.toString()
}