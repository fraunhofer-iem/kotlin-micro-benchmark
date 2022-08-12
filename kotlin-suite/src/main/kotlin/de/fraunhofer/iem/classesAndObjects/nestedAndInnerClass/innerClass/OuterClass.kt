package de.fraunhofer.iem.classesAndObjects.nestedAndInnerClass.innerClass

/**
 * Demonstrates the inner class in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
class OuterClass {
    private val outerFlag = 110
    fun printAll() {
        println(outerFlag)
    }

    inner class InnerClass {
        private val innerFlag = 23421
        fun printAll() {
            println(this.innerFlag)
            println(this@OuterClass.outerFlag)
        }
    }
}