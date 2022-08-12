package de.fraunhofer.iem.classesAndObjects.classes.constructors.defaultValue

/**
 * Demonstrates the default value for the parameters in constructors
 *
 * @author Ranjith Krishnamurthy
 */
class Employee(
    var firstName: String = "Unknown",
    var lastName: String = "NA",
    var age: Int = -100
)