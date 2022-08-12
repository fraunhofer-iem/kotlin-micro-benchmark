package de.fraunhofer.iem.uniqueToKotlin.primaryConstructor.argConstructor

/**
 * Demonstrates the instantiation of the class with constructor that takes arguments
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val employee: Employee = Employee("Ranjith", "K", 100)
    println(employee.firstName)
    println(employee.lastName)
    println(employee.age)
}