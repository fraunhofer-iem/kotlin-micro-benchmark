package de.fraunhofer.iem.uniqueToKotlin.highOrderFunctions.returnInLambda

/**
 * Demonstrates the return statement in lambda expression in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    // Implicit return in lambda expression
    println(printName {
        println(it)
        it
    })

    // Explicit return in lambda expression
    println(printName {
        println(it)
        return@printName it
    })
}

fun printName(printer: (String) -> String): String {
    return printer("Ranjith")
}
