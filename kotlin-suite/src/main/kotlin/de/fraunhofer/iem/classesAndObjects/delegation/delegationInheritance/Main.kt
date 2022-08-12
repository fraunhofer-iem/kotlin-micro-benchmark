package de.fraunhofer.iem.classesAndObjects.delegation.delegationInheritance

/**
 * Demonstrates the usage of the delegated class in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val car: Vehicle = Car()

    printVehicle(car)

    val electricCar = ElectricCar(car)

    printVehicle(electricCar)

    val truck = Truck(car)

    printVehicle(truck)

    val train = Train(car)

    printVehicle(train)
}

fun printVehicle(vehicle: Vehicle) {
    println(vehicle.vehicleType)
    vehicle.start()
    vehicle.accelerate()
    vehicle.stop()
}