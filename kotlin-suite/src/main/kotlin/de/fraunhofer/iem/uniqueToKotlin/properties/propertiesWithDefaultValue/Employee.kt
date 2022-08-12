package de.fraunhofer.iem.uniqueToKotlin.properties.propertiesWithDefaultValue

/**
 * Demonstrates the properties with some of them have default value
 *
 * @author Ranjith Krishnamurthy
 */
class Employee(
    var firstName: String,
    var lastName: String = "",
    var employeeID: String,
    var designation: String,
    var salary: Int = 10000,
    var address: String = "NA"
)