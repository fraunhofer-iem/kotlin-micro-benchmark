package de.fraunhofer.iem.basics.controlFlow.conditionAndLoops

/**
 * Demonstrates the while loop in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun whileExample(end: Int) {
    var x = end;
    while (x < 10) {
        println(x)
        ++x;
    }
}

fun main() {
    whileExample(0)
    whileExample(5)
    whileExample(15)
}