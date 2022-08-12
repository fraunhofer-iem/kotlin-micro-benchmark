package de.fraunhofer.iem.uniqueToKotlin.nullSafety.nonNullAssertionOperator

/**
 * Demonstrates the null safety using the non-null assertion operator in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    try {
        println(processString(null))
    } catch (ex: NullPointerException) {
        println("Received NullPointerException = ${ex.message}")
    }

    println(processString("Ranjith"))

    println(processString(null))
}

fun processString(name: String?): String {
    return "$name = ${name!!.length}"

}