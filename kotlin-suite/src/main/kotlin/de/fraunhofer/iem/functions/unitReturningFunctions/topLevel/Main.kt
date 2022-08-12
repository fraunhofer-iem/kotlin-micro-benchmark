package de.fraunhofer.iem.functions.unitReturningFunctions.topLevel

/**
 * Demonstrates the Unit returning top level functions in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun printMyName(name: String): Unit {
    println(name)
}

/**
 * Demonstrates the Unit? returning top level functions in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun printMyNameWithNullableUnit(name: String): Unit? {
    if (name == "null")
        return null

    return println(name)
}

/**
 * Demonstrates the usage of the Unit/Unit? returning functions
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    println(printMyName("Ranjith"))
    println(printMyNameWithNullableUnit("Ranjith"))
}