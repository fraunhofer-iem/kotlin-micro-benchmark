package de.fraunhofer.iem.uniqueToKotlin.properties.propertiesInClassBody

/**
 * Demonstrates the properties declared in the class body (as well as in the primary constructor)
 *
 * @author Ranjith Krishnamurthy
 */
class Employee(
    var firstName: String,
    var lastName: String,
    var employeeID: String
) {
    var designation: String = "NA"
    var salary: Int = -9999
    var address: String = "NA"
}