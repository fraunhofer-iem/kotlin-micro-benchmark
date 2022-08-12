package de.fraunhofer.iem.uniqueToKotlin.properties.bakingProperties

/**
 * Demonstrates the access of the properties
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val employee: Employee = Employee()
    println(employee.firstName)
    employee.firstName = "Ranjith"
    println(employee.firstName)
}