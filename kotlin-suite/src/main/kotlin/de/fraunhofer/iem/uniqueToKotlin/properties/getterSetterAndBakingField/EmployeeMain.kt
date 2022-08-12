package de.fraunhofer.iem.uniqueToKotlin.properties.getterSetterAndBakingField

/**
 * Demonstrates the access of the properties
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val employee: Employee = Employee()

    println("***** Before the modification *****")
    println(employee.firstName)
    println(employee.lastName)
    println(employee.employeeID)
    println(employee.designation)
    println(employee.salary)
    println(employee.address)

    println("***** After the modification *****")
    employee.firstName = "Ranjith"

    // below two lines give compilation error because lastName setter is private and employeeID is val
    // employee.lastName = "Ranjith"
    // employee.employeeID = "Ranjith"

    employee.designation = "Ranjith"
    employee.salary = 1000000
    employee.address = "Street 25"

    println(employee.firstName)
    println(employee.lastName)
    println(employee.employeeID)
    println(employee.designation)
    println(employee.salary)
    println(employee.address)
}