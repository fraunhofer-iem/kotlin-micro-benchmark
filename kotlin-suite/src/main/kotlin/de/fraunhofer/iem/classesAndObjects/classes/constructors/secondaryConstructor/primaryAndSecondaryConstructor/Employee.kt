package de.fraunhofer.iem.classesAndObjects.classes.constructors.secondaryConstructor.primaryAndSecondaryConstructor

/**
 * Demonstrates the secondary constructor with the primary constructor
 *
 * @author Ranjith Krishnamurthy
 */
class Employee(val firstName: String) {
    var lastName: String = ""
    var age: Int = -100

    init {
        println("Initializer block")
    }

    constructor(firstName: String, lastName: String) : this(firstName) {
        this.lastName = lastName
    }

    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = age;
    }

    init {
        println("Completed Initializer block")
    }
}