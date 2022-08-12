package de.fraunhofer.iem.classesAndObjects.interfaceInKotlin.propertiesInInterface

/**
 * Usage of interface and the class that implements interface that has properties
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val vehicle: Car = Car("ABC", "1234ADFR")
    vehicle.start()
    println(vehicle.modelNumber)
    println((vehicle as Vehicle).vehicleRegistrationNumber)
}