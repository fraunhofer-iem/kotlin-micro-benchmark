package de.fraunhofer.iem.classesAndObjects.interfaceInKotlin.defaultImplementationInInterface

/**
 * Demonstrates the default implementation of a method in Interface.
 *
 * @author Ranjith Krishnamurthy
 */
interface Vehicle {
    val modelNumber: String
    val vehicleRegistrationNumber: String

    fun start()

    fun stop()

    fun displayModelNumber() {
        println("Interface implementation = $modelNumber")
    }

    fun displayVehicleRegistrationNumber() {
        println("Interface implementation = $vehicleRegistrationNumber")
    }
}