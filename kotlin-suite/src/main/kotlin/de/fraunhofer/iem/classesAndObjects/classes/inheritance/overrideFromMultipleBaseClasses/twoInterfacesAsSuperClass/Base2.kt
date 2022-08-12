package de.fraunhofer.iem.classesAndObjects.classes.inheritance.overrideFromMultipleBaseClasses.twoInterfacesAsSuperClass

/**
 * Base 2, interface with default method, Second base class.
 *
 * @author Ranjith Krishnamurthy
 */
interface Base2 {
    fun print1() {
        println("Base2 --> print1")
    }

    fun print2() {
        println("Base2 --> print2")
    }
}