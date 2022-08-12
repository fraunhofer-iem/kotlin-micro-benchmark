package de.fraunhofer.iem.uniqueToKotlin.dataClasses.propertiesInsideDataClassBody

/**
 * Demonstrates the usage of Data class
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val employee: Employee = Employee(
        "Ranjith",
        "K",
        100,
    )

    // toString
    println(employee)

    // Property access
    println(employee.firstName)
    println(employee.lastName)
    println(employee.age)
    println(employee.mobileNumber)
    println(employee.address)
}