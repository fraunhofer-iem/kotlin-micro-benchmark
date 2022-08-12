package de.fraunhofer.iem.classesAndObjects.functionalInterface

/**
 * Usage of the functional interface (SAM), By default Kotlin uses wrapper class for this, since the interface contains
 * two method with one default implementation.
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val vehicle = Vehicle { println("Car is started") }
    vehicle.start()
    vehicle.stop()
}