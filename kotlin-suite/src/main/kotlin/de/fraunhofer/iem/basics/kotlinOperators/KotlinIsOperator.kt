package de.fraunhofer.iem.basics.kotlinOperators

/**
 * Demonstrates the is operator in Kotlin, equivalent to instanceof in Java
 */
fun main() {
    val name: String = "Ranjith"

    println(getLength(name))
    println(getLength(1))
    println(getLowerCase(1))
    println(getLowerCase(name))
}

/**
 * Demonstrates the is operator in Kotlin.
 */
fun getLength(ob: Any): Int {
    if (ob is String) {
        return ob.length
    }

    return -1
}

/**
 * Demonstrates the not is operator in Kotlin.
 */
fun getLowerCase(ob: Any): String {
    if (ob !is String) {
        return "na"
    }

    return ob.lowercase()
}