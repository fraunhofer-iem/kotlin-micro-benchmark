package de.fraunhofer.iem.functions.simpleExample.classMemberFunctions

/**
 * Demonstrate the usage of the member functions in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val twoInts: TwoInts = TwoInts()

    println(twoInts.add(10, 20))
    println(twoInts.sub(20, 10))
    println(twoInts.publicAdd10(20, 10))
}