package de.fraunhofer.iem.classesAndObjects.visibilityModifiers.internal

/**
 * Demonstrates the internal class and internal class members in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
internal class InternalClass(val val1: String, private val val2: String, internal val val3: String) :
    InternalInterface {
    override fun printVal1() {
        println(val1)
    }

    private fun printVal2() {
        println(val2)
    }

    internal fun printVal3() {
        println(val3)
    }
}