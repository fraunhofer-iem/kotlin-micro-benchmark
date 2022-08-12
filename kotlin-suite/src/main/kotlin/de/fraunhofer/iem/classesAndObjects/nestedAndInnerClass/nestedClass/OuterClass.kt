package de.fraunhofer.iem.classesAndObjects.nestedAndInnerClass.nestedClass

/**
 * Demonstrates the nested class in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
class OuterClass {
    private val outerFlag = 110
    fun printAll() {
        println(outerFlag)
    }

    class InnerClass {
        private val innerFlag = 23421
        fun printAll() {
            println(innerFlag)
        }
    }
}