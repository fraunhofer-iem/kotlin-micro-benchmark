package de.fraunhofer.iem.basics.controlFlow.conditionAndLoops

/**
 * Demonstrates the do while loop in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun doWhileExample(end: Int) {
    var x = end;

    do {
        println(x)
        ++x;
    } while (x < 10)
}

fun main() {
    doWhileExample(0)
    doWhileExample(5)
    doWhileExample(15)
}