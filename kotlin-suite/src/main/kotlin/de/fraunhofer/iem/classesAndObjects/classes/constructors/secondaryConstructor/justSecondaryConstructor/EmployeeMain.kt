package de.fraunhofer.iem.classesAndObjects.classes.constructors.secondaryConstructor.justSecondaryConstructor

/**
 * Instantiation for the secondary constructor example code.
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val employee = Employee("Ranjith", "K", 100)
    println(employee.firstName)
    println(employee.lastName)
    println(employee.age)
}