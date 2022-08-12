package de.fraunhofer.iem.classesAndObjects.objectExpressionAndObjectDeclaration.objectDeclaration.companionObject.named

/**
 * Demonstrates the usage of the named companion object
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val employee = Employee("Ranjith", "K", 100)
    println(Employee.companyName)
    println(Employee.EmployeeCompanion.companyName)
    Employee.printEmployee(employee)
    Employee.EmployeeCompanion.printEmployee(employee)
    employee.printPrivateCompanion()
    Employee.jvmStaticCompanionMethod()
}