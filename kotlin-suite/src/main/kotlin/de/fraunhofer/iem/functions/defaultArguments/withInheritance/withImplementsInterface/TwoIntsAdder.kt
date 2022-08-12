package de.fraunhofer.iem.functions.defaultArguments.withInheritance.withImplementsInterface

interface TwoIntsAdder {
    /**
     * Demonstrate the all parameters have default value in Kotlin interface
     *
     * @author Ranjith Krishnamurthy
     */
    fun add(num1: Int = 0, num2: Int = 0, num3: Int = 0, num4: Int = 0): Int {
        return num1 + num2 + num3 + num4
    }

    /**
     * Demonstrate the some parameters have default value in Kotlin interface
     *
     * @author Ranjith Krishnamurthy
     */
    fun add10(num1: Int, num2: Int = 0, num3: Int = 0, num4: Int): Float {
        return num1.toFloat() + num2 + num3 + num4 + 10
    }
}