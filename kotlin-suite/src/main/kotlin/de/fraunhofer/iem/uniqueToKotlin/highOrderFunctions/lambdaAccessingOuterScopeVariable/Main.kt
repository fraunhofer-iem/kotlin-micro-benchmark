package de.fraunhofer.iem.uniqueToKotlin.highOrderFunctions.lambdaAccessingOuterScopeVariable

/**
 * Demonstrates the lambda expression and anonymous function accessing the outer scope variables in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    var name: String = "Ranjith"

    // Implicit return in lambda expression
    println(printName {
        println(name)
        name += " K"
        name
    })

    // Explicit return in lambda expression
    println(printName(fun(): String {
        println(name)
        name += " Krisnamurthy"
        return@printName name
    }))
}

fun printName(printer: () -> String): String {
    return printer()
}
