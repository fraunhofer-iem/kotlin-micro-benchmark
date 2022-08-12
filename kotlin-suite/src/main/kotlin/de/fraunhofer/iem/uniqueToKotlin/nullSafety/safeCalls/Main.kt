package de.fraunhofer.iem.uniqueToKotlin.nullSafety.safeCalls

/**
 * Demonstrates the null safety using the safe calls in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    usingSafeCalls(null)
    usingSafeCalls("Ranjith")

    usingSafeCallsWithLet(null)
    usingSafeCallsWithLet("Ranjith")

    var name: String? = getString()
    println("$name = ${name?.length}")

    name = getString()
    name?.let {
        println("$name = ${name.length}")
    }
}

fun usingSafeCalls(name: String?) {
    println("$name = ${name?.length}")
}

fun usingSafeCallsWithLet(name: String?) {
    name?.let {
        println("$name = ${name.length}")
    }
}

fun getString(): String? {
    println("Should we send null?")
    if (readLine()?.lowercase() == "y") {
        return null
    }

    return "Ranjith"
}