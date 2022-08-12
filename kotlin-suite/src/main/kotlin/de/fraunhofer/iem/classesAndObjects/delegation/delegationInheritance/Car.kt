package de.fraunhofer.iem.classesAndObjects.delegation.delegationInheritance

/**
 * Car implements the Vehicle without delegation
 *
 * @author Ranjith Krishnamurthy
 */
class Car : Vehicle {
    override val vehicleType = "Car"

    override fun start() {
        println("$vehicleType Engine Started")
    }

    override fun stop() {
        println("$vehicleType Engine Stopped")
    }

    override fun accelerate() {
        println("Accelerated")
    }
}