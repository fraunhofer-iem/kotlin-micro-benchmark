package de.fraunhofer.iem.uniqueToKotlin.properties.propertiesInClassBody

/**
 * Demonstrates the access of the properties
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val employee: Employee = Employee(
        "Ranjith",
        "K",
        "1234QWE"
    )

    println(employee.firstName)
    println(employee.lastName)
    println(employee.employeeID)
    println(employee.designation)
    println(employee.salary)
    println(employee.address)
}