package de.fraunhofer.iem.basics.kotlinOperators

/**
 * Demonstrates the Safe Cast operator in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    dummy("Ranjith")
    dummy(123)
    dummy(null)
}

/**
 * If ob is null still gets ClassCastException
 */
private fun dummy(ob: Any?) {
    val temp: String? = ob as? String

    println("String = $temp")
}