package de.fraunhofer.iem.classesAndObjects.classes.inheritance.baseDerivedWithMultipleConstructor

/**
 * Non-class that can be a superclass to another class. Demonstrates the two constructor for inheritance example
 *
 * @author Ranjith Krishnamurthy
 */
open class Animal(private val DNA: String) {

    constructor() : this("AAAATTTTCCCCGG")

    /**
     * Derived class can override this method since it is a non-final method
     */
    open fun makeNoise() {
        println("This is abstract animal sound!")
    }

    /**
     * Derived class can not override this method since it is a final method
     */
    fun displayDNA() {
        println(DNA)
    }
}