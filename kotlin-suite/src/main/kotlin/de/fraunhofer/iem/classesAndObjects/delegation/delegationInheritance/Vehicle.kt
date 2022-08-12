package de.fraunhofer.iem.classesAndObjects.delegation.delegationInheritance

/**
 * Example interface to demonstrate the delegation in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
interface Vehicle {
    val vehicleType: String

    fun start()
    fun stop()
    fun accelerate()
}