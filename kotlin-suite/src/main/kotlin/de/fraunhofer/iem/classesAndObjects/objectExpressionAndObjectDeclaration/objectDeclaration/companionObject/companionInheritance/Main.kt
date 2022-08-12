package de.fraunhofer.iem.classesAndObjects.objectExpressionAndObjectDeclaration.objectDeclaration.companionObject.companionInheritance

/**
 * Demonstrates the usage of the companion object that inherits the type
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val employee1: Employee = Employee.getInstance()
    val employeeBuilder1: EmployeeBuilder = Employee.EmployeeCompanion
    val employeeBuilder2: EmployeeBuilder = Employee

    val employee2: Employee = employeeBuilder1.getInstance()
    val employee3: Employee = employeeBuilder2.getInstance()

    println(employee1)
    println(employee2)
    println(employee3)

    println(Employee.companyName)
    Employee.companyName = "YourCompany"
    println(Employee.companyName)
}