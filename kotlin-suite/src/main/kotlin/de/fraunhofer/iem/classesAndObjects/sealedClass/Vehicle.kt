package de.fraunhofer.iem.classesAndObjects.sealedClass

/**
 * Demonstrates the sealed class in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
sealed class Vehicle(val vehicleRegistrationNumber: String) {
    open fun displayVehicleRegistrationNumber() {
        println("$vehicleRegistrationNumber in Vehicle")
    }
}

/**
 * Demonstrates the class the extends the sealed class
 *
 * @author Ranjith Krishnamurthy
 */
class Car(val registrationNumber: String) : Vehicle(registrationNumber)

/**
 * Demonstrates the class that extends and override the method of sealed class
 *
 * @author Ranjith Krishnamurthy
 */
class Truck(val registrationNumber: String) : Vehicle(registrationNumber) {
    override fun displayVehicleRegistrationNumber() {
        println("$vehicleRegistrationNumber in Truck")
    }
}

/**
 * Demonstrates the data class that extends the sealed class
 *
 * @author Ranjith Krishnamurthy
 */
data class Bus(val registrationNumber: String) : Vehicle(registrationNumber) {
    override fun displayVehicleRegistrationNumber() {
        println("$vehicleRegistrationNumber in Bus")
    }
}

/**
 * Demonstrates the access of sealed class
 *
 * @author Ranjith Krishnamurthy
 */
fun displayInformation(vehicle: Vehicle) {
    vehicle.displayVehicleRegistrationNumber()
}

/**
 * Demonstrates the usage of sealed class in When statement
 *
 * @author Ranjith Krishnamurthy
 */
fun demonstrateWhenWithSealedClass(vehicle: Vehicle) {
    when (vehicle) {
        is Car -> println("Car ${vehicle.registrationNumber}")
        is Truck -> println("Truck ${vehicle.registrationNumber}")
        is Bus -> println("Bus ${vehicle.registrationNumber}")
    }
}

/**
 * Demonstrates the access of sealed class and its derived classes
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val car = Car("AASD")
    println(car.registrationNumber)
    displayInformation(car)

    val bus = Bus("TJSUGF")
    println(bus.registrationNumber)
    displayInformation(bus)

    val truck = Truck("BXHDG")
    println(truck.registrationNumber)
    displayInformation(truck)

    demonstrateWhenWithSealedClass(Bus("SDGRST"))
}