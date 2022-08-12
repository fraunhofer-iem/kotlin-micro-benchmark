package de.fraunhofer.iem.functions.localFunctions.inClass

/**
 * Demonstrate the usage of the local functions (indirectly)
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val incrementer = Incrementer()

    println("Result = ${incrementer.stepIncrementer(0, 10, 1)}\n")
    println("Result = ${incrementer.stepIncrementer(100, 10, 100)}\n")
    println("Result = ${incrementer.stepIncrementer(21, 100, 123)}\n")

    println("Result = ${incrementer.stepIncrementer1For10Count(0)}\n")
    println("Result = ${incrementer.stepIncrementer1For10Count(100)}\n")
    println("Result = ${incrementer.stepIncrementer1For10Count(21)}\n")
}