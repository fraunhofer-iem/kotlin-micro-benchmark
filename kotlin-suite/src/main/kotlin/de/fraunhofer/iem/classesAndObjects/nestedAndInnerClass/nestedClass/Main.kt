package de.fraunhofer.iem.classesAndObjects.nestedAndInnerClass.nestedClass

/**
 * Demonstrates the usage of the nested class in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val outerClass = OuterClass()
    outerClass.printAll()

    val innerClass = OuterClass.InnerClass()
    innerClass.printAll()
}