package de.fraunhofer.iem.classesAndObjects.functionalInterface

/**
 * Demonstrates the functional interface (SAM)
 *
 * @author Ranjith Krishnamurthy
 */
fun interface Vehicle {
    fun start()
    fun stop() {
        println("Vehicle is stopped")
    }
}