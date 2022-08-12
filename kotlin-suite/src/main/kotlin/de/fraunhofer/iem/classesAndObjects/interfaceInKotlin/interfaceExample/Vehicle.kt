package de.fraunhofer.iem.classesAndObjects.interfaceInKotlin.interfaceExample

/**
 * Demonstrates the Interface in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
interface Vehicle {
    fun start()
    fun stop()
    fun accelerate(speed: Int)
    fun changeGear(to: Int)
    fun getCurrentSpeed(): Int
}