package de.fraunhofer.iem.functions.simpleExample.classMemberFunctions

class TwoInts() {
    /**
     * Demonstrate the public class member function in Kotlin
     *
     * @author Ranjith Krishnamurthy
     */
    fun add(num1: Int, num2: Int): Int = num1 + num2

    fun publicAdd10(num1: Int, num2: Int) = add10(num1, num2)
    
    /**
     * Demonstrate the private class member function in Kotlin
     *
     * @author Ranjith Krishnamurthy
     */
    private fun add10(num1: Int, num2: Int): Float {
        return num1.toFloat() + num2 + 10
    }

    /**
     * Demonstrate internal class member single-expression function in Kotlin
     *
     * @author Ranjith Krishnamurthy
     */
    internal fun sub(num1: Int, num2: Int) = num1 - num2
}