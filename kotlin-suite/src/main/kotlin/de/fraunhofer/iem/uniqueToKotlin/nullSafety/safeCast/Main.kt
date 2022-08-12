package de.fraunhofer.iem.uniqueToKotlin.nullSafety.safeCast

/**
 * Demonstrate the safe cast in kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    println(castToString("ranjith"))

    try {
        println(castToString(null))
    } catch (ex: Exception) {
        println("Got Exception = ${ex.message}")
    }

    try {
        println(castToString(1))
    } catch (ex: Exception) {
        println("Got Exception = ${ex.message}")
    }

    println(castToNullableString("ranjith"))

    try {
        println(castToNullableString(null))
    } catch (ex: Exception) {
        println("Got Exception = ${ex.message}")
    }

    try {
        println(castToNullableString(1))
    } catch (ex: Exception) {
        println("Got Exception = ${ex.message}")
    }

    println(castSafelyToNullableString("ranjith"))
    println(castSafelyToNullableString(null))
    println(castSafelyToNullableString(1))
}

/**
 * Demonstrate the safe cast in kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun castSafelyToNullableString(ob: Any?): String? {
    return ob as? String
}

/**
 * Demonstrate the casting the nullable object to non-null String
 *
 * @author Ranjith Krishnamurthy
 */
fun castToString(ob: Any?): String {
    return ob as String
}

/**
 * Demonstrate the casting the nullable object to nullable String
 *
 * @author Ranjith Krishnamurthy
 */
fun castToNullableString(ob: Any?): String? {
    return ob as String?
}