package de.fraunhofer.iem.uniqueToKotlin.rangesAndProgressions.ranges.inCustomClass

/**
 * Demonstrates the usage of the custom range and progression
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val myInt1 = MyInt(1)
    val myInt10 = MyInt(10)

    for (i in myInt1..myInt10) {
        println(i)
    }
}