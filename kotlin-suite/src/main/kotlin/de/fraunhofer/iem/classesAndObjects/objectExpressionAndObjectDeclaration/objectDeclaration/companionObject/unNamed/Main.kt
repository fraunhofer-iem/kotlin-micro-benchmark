package de.fraunhofer.iem.classesAndObjects.objectExpressionAndObjectDeclaration.objectDeclaration.companionObject.unNamed

/**
 * Demonstrates the usage of the companion object
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val employee = Employee("Ranjith", "K", 100)
    println(Employee.companyName)
    println(Employee.Companion.companyName)
    Employee.printEmployee(employee)
    Employee.Companion.printEmployee(employee)
    employee.printPrivateCompanion()
    Employee.jvmStaticCompanionMethod()
}