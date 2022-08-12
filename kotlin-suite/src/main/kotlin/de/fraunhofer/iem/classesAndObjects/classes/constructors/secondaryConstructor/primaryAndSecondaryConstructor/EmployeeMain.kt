package de.fraunhofer.iem.classesAndObjects.classes.constructors.secondaryConstructor.primaryAndSecondaryConstructor

/**
 * Instantiation for the example of primary and secondary constructor
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val employee = Employee("Ranjith", "K", 100)
    println(employee.firstName)
    println(employee.lastName)
    employee.age = 200
    println(employee.age)
}