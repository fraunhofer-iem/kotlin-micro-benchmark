package de.fraunhofer.iem.basics.controlFlow.returnsAndJumps

/**
 * Demonstrates the return Unit (equivalent to Java's void) in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun returnNothing(num: Int) {
    if (num == 0) return
    if (num > 10) println("Greater than 10")
    if (num < 100) return
    if (num > 1000) println("Greater than 1000")
}

/**
 * Demonstrates the return value (in Java bytecode primitive values) in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun returnValue(num: Int): Int {
    if (num == 0) return -1
    if (num > 10) println("Greater than 10")
    if (num < 100) return -100
    if (num > 1000) println("Greater than 1000")
    return 404
}

/**
 * Demonstrates the return Object in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun returnObject(num: Int): String? {
    if (num == 0) return "-1"
    if (num > 10) println("Greater than 10")
    if (num < 100) return "-100"
    if (num > 1000) println("Greater than 1000")
    return "404"
}

/**
 * Demonstrates the return statement in Lambda expression
 */
private fun returnInLambda() {
    val numbers = ArrayList<Int>()
    numbers.add(5)
    numbers.add(9)
    numbers.add(8)
    numbers.add(1)
    numbers.forEach { n: Int ->
        println(n)
        if (n % 2 == 0) return   // return to the caller of returnInLambda function
        println("Welcome to Lambda")
    }
}

fun main() {
    returnNothing(0)
    println(returnObject(1))
    println(returnValue(1251))
    returnInLambda();
    println("Ending Main")
}