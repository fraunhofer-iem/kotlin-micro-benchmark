package de.fraunhofer.iem.classesAndObjects.interfaceInKotlin.propertiesInInterface

/**
 * Demonstrates the implementing the interface that has properties
 *
 * @author Ranjith Krishnamurthy
 */
class Car(override val modelNumber: String, override var vehicleRegistrationNumber: String) : Vehicle {
    private var isStart = false

    override fun start() {
        if (isStart) {
            println("Car is already started.")
        }

        isStart = true
    }

    override fun stop() {
        if (!isStart) {
            println("Car is already stopped.")
        }

        isStart = false
    }
}