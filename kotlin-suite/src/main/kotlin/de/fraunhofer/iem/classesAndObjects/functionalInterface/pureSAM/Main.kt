package de.fraunhofer.iem.classesAndObjects.functionalInterface.pureSAM

/**
 * Usage of the functional interface (SAM), By default Kotlin uses invokedynamic for this, since the interface contains
 * only one method
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val vehicle = Vehicle { println("Car is started") }
    vehicle.start()
}