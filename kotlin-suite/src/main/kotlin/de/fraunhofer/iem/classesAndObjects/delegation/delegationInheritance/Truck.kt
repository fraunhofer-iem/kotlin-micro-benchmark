package de.fraunhofer.iem.classesAndObjects.delegation.delegationInheritance

/**
 * Delegates, but override some methods and property
 *
 * @author Ranjith Krishnamurthy
 */
class Truck(vehicle: Vehicle) : Vehicle by vehicle {
    override val vehicleType = "Truck"

    override fun start() {
        println("$vehicleType Engine Started")
    }

    override fun stop() {
        println("$vehicleType Engine Stopped")
    }
}