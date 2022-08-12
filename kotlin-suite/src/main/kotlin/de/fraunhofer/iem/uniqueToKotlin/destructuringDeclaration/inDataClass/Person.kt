package de.fraunhofer.iem.uniqueToKotlin.destructuringDeclaration.inDataClass

/**
 * Helper class to demonstrate the destructuring declaration.
 *
 * Note:
 * 1. Data class by default contains a componentN function that is used for the destructuring declaration
 *
 * @author Ranjith Krishnamurthy
 */
data class Person(
    val name: String,
    val address: String,
    val age: Int,
    val mobileNumber: String
)