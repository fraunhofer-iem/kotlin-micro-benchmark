package de.fraunhofer.iem.basics.kotlinOperators

/**
 * Demonstrates the Cast operator in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    dummy1("Ranjith")
    dummy2("Ranjith")
    dummy2(null)

    dummy1(null) //ClassCastException
    dummy1(123) //ClassCastException
    dummy2(123) //ClassCastException
}

/**
 * If ob is null still gets ClassCastException
 */
private fun dummy1(ob: Any?) {
    val temp: String = ob as String

    println("String = $temp")
}

/**
 * If ob is null casting is successful
 */
private fun dummy2(ob: Any?) {
    val temp: String? = ob as String?

    println("String = $temp")
}