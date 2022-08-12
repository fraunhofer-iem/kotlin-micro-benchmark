package de.fraunhofer.iem.functions.defaultArguments.withInheritance

class TwoInts() : TwoIntsAdder() {
    /**
     * Demonstrate the all parameters have default value from the base class in Kotlin
     *
     * @author Ranjith Krishnamurthy
     */
    override fun add(num1: Int, num2: Int, num3: Int, num4: Int): Int {
        return num1 + num2 + num3 + num4
    }

    /**
     * Demonstrate the some parameters have default value from the base class in Kotlin
     *
     * @author Ranjith Krishnamurthy
     */
    override fun add10(num1: Int, num2: Int, num3: Int, num4: Int): Float {
        return num1.toFloat() + num2 + num3 + num4 + 10
    }

    /**
     * Demonstrate no default value from the base class in Kotlin
     *
     * @author Ranjith Krishnamurthy
     */
    fun sub(num1: Int, num2: Int, num3: Int, num4: Int) = num1 - num2 - num3 - num4
}