package de.fraunhofer.iem.classesAndObjects.classes.constructors.secondaryConstructor.justSecondaryConstructor

/**
 * Demonstrates the secondary constructor without the primary constructor
 *
 * @author Ranjith Krishnamurthy
 */
class Employee {
    var firstName: String = ""
    var lastName: String = ""
    var age: Int = -100

    init {
        println("Initializer block")
        println("Completed Initializer block")
    }

    constructor(firstName: String, lastName: String, age: Int) {
        println("Secondary Constructor")
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
        println("Completed Secondary Constructor")
    }

    // Just to demonstrate the order of the init block in the primary constructor in the Java bytecode
    init {
        println("Second Initializer block")
        println("Completed Second Initializer block")
    }
}