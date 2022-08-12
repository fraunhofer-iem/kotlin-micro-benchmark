package de.fraunhofer.iem.uniqueToKotlin.properties.propertiesWithDefaultValue

/**
 * Demonstrates the access of the properties
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val employee: Employee = Employee(
        "Ranjith",
        employeeID = "1234QWE",
        designation = "Developer",
        salary = 9900990,
    )

    println(employee.firstName)
    println(employee.lastName)
    println(employee.employeeID)
    println(employee.designation)
    println(employee.salary)
    println(employee.address)
}