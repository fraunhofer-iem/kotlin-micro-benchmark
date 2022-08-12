package de.fraunhofer.iem.classesAndObjects.nestedAndInnerClass.innerClass

/**
 * Demonstrates the usage of the inner class in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val outerClass = OuterClass()
    outerClass.printAll()

    val innerClass = outerClass.InnerClass()
    innerClass.printAll()
}