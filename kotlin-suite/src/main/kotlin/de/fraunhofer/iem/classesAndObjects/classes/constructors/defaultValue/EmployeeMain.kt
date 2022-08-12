package de.fraunhofer.iem.classesAndObjects.classes.constructors.defaultValue

/**
 * Instantiation for the example of default value code.
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val employee: Employee = Employee(age = 100)
    println(employee.firstName)
    println(employee.lastName)
    println(employee.age)
}