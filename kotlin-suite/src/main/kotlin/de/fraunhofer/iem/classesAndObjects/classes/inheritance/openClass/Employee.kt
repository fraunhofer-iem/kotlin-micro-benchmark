package de.fraunhofer.iem.classesAndObjects.classes.inheritance.openClass

/**
 * Demonstrates the open class/method in Kotlin
 *
 * Note:
 * 1. In Kotlin, by default all class and methods are final, to make it non-final use open
 *
 * @author Ranjith Krishnamurthy
 */
open class Employee {
    // Makes the function depositSalary a non-final method, that means it can be override in derived class.
    open fun depositSalary() {
        println("Salary deposited")
    }

    fun pensionDeduction() {
        println("Pension deduction")
    }
}