package de.fraunhofer.iem.classesAndObjects.classes.constructors.defaultValue

/**
 * Instantiation for the example of default value code. In this example, demonstrates what happens if we pass all the
 * parameter.
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val employee: Employee = Employee("Ranjith", "K", 100)
    println(employee.firstName)
    println(employee.lastName)
    println(employee.age)
}