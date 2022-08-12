package de.fraunhofer.iem.classesAndObjects.visibilityModifiers.internal

internal val topLevelInternal = "What"

internal fun printTopLevelInternal() {
    println(topLevelInternal)
}

/**
 * Demonstrates the internal in top level
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val internalClass = InternalClass("val1", "val2", "val3")

    internalClass.printVal1()
    internalClass.printVal3()
}