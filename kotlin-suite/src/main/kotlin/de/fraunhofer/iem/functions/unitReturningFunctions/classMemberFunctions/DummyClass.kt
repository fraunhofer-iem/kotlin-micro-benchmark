package de.fraunhofer.iem.functions.unitReturningFunctions.classMemberFunctions

/**
 * Demonstrates the Unit returning member functions in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
class DummyClass {
    /**
     * Demonstrates the Unit returning member functions in Kotlin
     */
    fun printMyName(name: String): Unit {
        println(name)
    }

    /**
     * Demonstrates the Unit? returning member functions in Kotlin
     */
    fun printMyNameWithNullableUnit(name: String): Unit? {
        if (name == "null")
            return null

        return println(name)
    }
}