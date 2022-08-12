package de.fraunhofer.iem.uniqueToKotlin.dataClasses.propertiesInsideDataClassBody

/**
 * Demonstrates the Data class in Kotlin, some properties are defined inside the body, also default value for property
 *
 * @author Ranjith Krishnamurthy
 */
data class Employee(
    val firstName: String = "",
    val lastName: String = "",
    val age: Int = 25,
    val address: String = "Company Main Branch"
) {
    val mobileNumber: String = ""
}
