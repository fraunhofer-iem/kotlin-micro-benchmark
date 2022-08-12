package de.fraunhofer.iem.classesAndObjects.classes.inheritance.overrideFromMultipleBaseClasses.twoInterfacesAsSuperClass

/**
 * Base 1, interface with default method, First base class.
 *
 * @author Ranjith Krishnamurthy
 */
interface Base1 {
    fun print1() {
        println("Base1 --> print1")
    }

    fun print2() {
        println("Base1 --> print2")
    }
}