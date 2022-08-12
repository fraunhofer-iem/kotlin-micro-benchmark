package de.fraunhofer.iem.functions.defaultArguments.topLevel

/**
 * Demonstrate the all parameters have default value in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun add(num1: Int = 0, num2: Int = 0, num3: Int = 0, num4: Int = 0): Int {
    return num1 + num2 + num3 + num4
}

/**
 * Demonstrate the some parameters have default value in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun add10(num1: Int, num2: Int = 0, num3: Int = 0, num4: Int): Float {
    return num1.toFloat() + num2 + num3 + num4 + 10
}

/**
 * Demonstrate no default value in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun sub(num1: Int, num2: Int, num3: Int, num4: Int) = num1 - num2 - num3 - num4

/**
 * Demonstrate the usage of the functions with default value in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    println(add())
    println(add(10))
    println(add(10, 20))
    println(add(num2 = 20, num4 = 40))
    println(add(10, 20, 30, 40))


    println(add10(10, num4 = 40))
    println(add10(10, 20, num4 = 40))
    println(add10(10, num3 = 30, num4 = 40))
    println(add10(10, 20, 30, 40))
    println(add10(num4 = 40, num1 = 10, num3 = 30, num2 = 20))

    println(sub(100, 20, 30, 40))
}