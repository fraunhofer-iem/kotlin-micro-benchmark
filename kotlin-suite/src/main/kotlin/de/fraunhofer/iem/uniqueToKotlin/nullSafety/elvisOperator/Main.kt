package de.fraunhofer.iem.uniqueToKotlin.nullSafety.elvisOperator

import de.fraunhofer.iem.uniqueToKotlin.nullSafety.safeCalls.getString

/**
 * Demonstrates the null safety using the elvis operator in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    println(returnNonNullValue(null))
    println(returnNonNullValue("Ranjith"))

    println(returnProcessedStringOrNull(null))
    println(returnProcessedStringOrNull("Ranjith"))

    try {
        println(returnProcessedStringOrThrowException(null))
        println(returnProcessedStringOrThrowException("Ranjith"))
    } catch (ex: IllegalArgumentException) {
        println("Got IllegalArgumentException = ${ex.message}")
    }

    processAllInOneMethod()
}

fun returnNonNullValue(name: String?): String {
    val len: Int = name?.length ?: 0

    return "$name = $len"
}

fun returnProcessedStringOrNull(name: String?): String? {
    val len: Int = name?.length ?: return null

    return "$name = $len"
}

fun returnProcessedStringOrThrowException(name: String?): String {
    val len: Int = name?.length ?: throw IllegalArgumentException("Illegal argument: Given argument is null")

    return "$name = $len"
}

fun processAllInOneMethod() {
    var name: String? = getString()
    var len: Int = name?.length ?: 0

    println("$name = $len")

    name = getString()
    len = name?.length ?: throw IllegalArgumentException("Illegal argument: Given argument is null")

    println("$name = $len")
}