package de.fraunhofer.iem.uniqueToKotlin.smartCast

/**
 * Demonstrates the SmartCast in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    displayLength("Ranjith")
    displayLength(542.54)
    isString("Ranjith")
}

/**
 * Demonstrates the SmartCast in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun displayLength(ob: Any) {
    if (ob is String)
        return println("Length = ${ob.length}")

    println("Length = -1")
}

/**
 * Demonstrates the negative SmartCast in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun isString(ob: CharSequence) {
    if (ob !is String)
        println("$ob is not String")

    println("${ob.length} is String")
}