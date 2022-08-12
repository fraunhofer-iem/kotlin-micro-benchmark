package de.fraunhofer.iem.classesAndObjects.objectExpressionAndObjectDeclaration.objectDeclaration.companionObject.unNamed

/**
 * Demonstrate the companion object in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
class Employee(
    var firstName: String,
    var lastName: String,
    var age: Int
) {
    companion object {
        const val companyName = "MyCompany"
        private var companyAddress: String = "Street 22"

        fun printEmployee(employee: Employee) {
            companyAddress += employee.firstName
            println("${companyName}:\n${companyAddress}\nEmployee:\n${employee.firstName}\n${employee.lastName}\n${employee.age}\n")
        }

        private fun privateCompanionObject() {
            println("Private companion method")
        }

        @JvmStatic
        fun jvmStaticCompanionMethod() {
            println("I am JVM static method")
        }
    }

    fun printPrivateCompanion() {
        privateCompanionObject()
    }
}