package de.fraunhofer.iem.functions.unitReturningFunctions.classMemberFunctions

/**
 * Demonstrates the usage of the Unit/Unit? returning functions
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val dummyClass: DummyClass = DummyClass()

    println(dummyClass.printMyName("Ranjith"))
    println(dummyClass.printMyNameWithNullableUnit("Ranjith"))
}