package de.fraunhofer.iem.classesAndObjects.interfaceInKotlin.defaultImplementationInInterface

/**
 * Usage of interface and the class that implements interface that has default implementation of a method
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val car = Car("ABC", "1234ADFR")

    car.start()

    car.displayVehicleRegistrationNumber()
    car.displayModelNumber()

    (car as Vehicle).displayVehicleRegistrationNumber()
    (car as Vehicle).displayModelNumber()

    println((car as Vehicle).modelNumber)
    println((car as Vehicle).vehicleRegistrationNumber)
}