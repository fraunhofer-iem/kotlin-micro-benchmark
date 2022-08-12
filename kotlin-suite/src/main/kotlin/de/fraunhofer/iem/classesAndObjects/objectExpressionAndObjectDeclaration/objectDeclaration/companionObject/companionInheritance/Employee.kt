package de.fraunhofer.iem.classesAndObjects.objectExpressionAndObjectDeclaration.objectDeclaration.companionObject.companionInheritance

interface EmployeeBuilder {
    fun getInstance(): Employee;
}

/**
 * Demonstrate the companion object that inherits the type
 *
 * @author Ranjith Krishnamurthy
 */
class Employee private constructor() {

    companion object EmployeeCompanion : EmployeeBuilder {
        var companyName = "MyCompanyName"
        override fun getInstance(): Employee {
            return Employee()
        }
    }
}