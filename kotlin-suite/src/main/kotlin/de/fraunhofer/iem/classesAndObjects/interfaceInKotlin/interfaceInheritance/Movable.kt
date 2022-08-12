package de.fraunhofer.iem.classesAndObjects.interfaceInKotlin.interfaceInheritance

/**
 * Demonstrates the multiple inheritance in interface
 *
 * @author Ranjith Krishnamurthy
 */
interface Movable : Runnable, Walkable {
    fun jog()
}