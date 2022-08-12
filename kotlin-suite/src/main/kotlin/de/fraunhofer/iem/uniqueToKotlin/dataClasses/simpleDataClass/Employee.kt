package de.fraunhofer.iem.uniqueToKotlin.dataClasses.simpleDataClass

/**
 * Demonstrates the Data class in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
data class Employee(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val mobileNumber: String,
    val address: String
)
