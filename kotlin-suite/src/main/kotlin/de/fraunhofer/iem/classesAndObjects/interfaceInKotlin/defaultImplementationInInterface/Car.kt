package de.fraunhofer.iem.classesAndObjects.interfaceInKotlin.defaultImplementationInInterface

/**
 * Demonstrates the implementing the interface that has the default implementation of a method
 *
 * @author Ranjith Krishnamurthy
 */
class Car(override var modelNumber: String, override var vehicleRegistrationNumber: String) : Vehicle {
    private var isStart = false

    override fun displayModelNumber() {
        println(modelNumber)
    }

    override fun start() {
        if (isStart) {
            System.err.println("Car is already started.")
        }
        isStart = true
    }

    override fun stop() {
        if (!isStart) {
            System.err.println("Car is already stopped.")
        }
        isStart = false
    }
}