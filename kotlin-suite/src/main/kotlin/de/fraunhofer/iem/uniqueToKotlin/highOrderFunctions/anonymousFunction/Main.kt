package de.fraunhofer.iem.uniqueToKotlin.highOrderFunctions.anonymousFunction

/**
 * Demonstrates the anonymous function in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    // Implicit return in lambda expression
    println(printName(fun(it: String): String {
        println(it)
        return it
    }))

    val anonymousFun = fun(it: String): String = it

    println(printName(anonymousFun))
}

fun printName(printer: (String) -> String): String {
    return printer("Ranjith")
}
