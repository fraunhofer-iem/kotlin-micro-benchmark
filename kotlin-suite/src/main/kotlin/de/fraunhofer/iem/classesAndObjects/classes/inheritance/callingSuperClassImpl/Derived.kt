package de.fraunhofer.iem.classesAndObjects.classes.inheritance.callingSuperClassImpl

/**
 * Demonstrates the calling of super class implementation
 *
 * @author Ranjith Krishnamurthy
 */
class Derived : Base() {
    override fun print() {
        super.print()   // Super class implementation is called
        println("Derived")
    }
}