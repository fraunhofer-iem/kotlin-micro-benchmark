package de.fraunhofer.iem.classesAndObjects.interfaceInKotlin.propertiesInInterface

/**
 * Demonstrates the properties in Interface
 *
 * @author Ranjith Krishnamurthy
 */
interface Vehicle {
    val modelNumber: String
    var vehicleRegistrationNumber: String

    fun start()
    fun stop()
}