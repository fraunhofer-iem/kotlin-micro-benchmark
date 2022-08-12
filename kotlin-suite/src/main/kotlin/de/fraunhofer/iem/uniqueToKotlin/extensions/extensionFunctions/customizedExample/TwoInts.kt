package de.fraunhofer.iem.uniqueToKotlin.extensions.extensionFunctions.customizedExample

/**
 * This is a helper class to demonstrate the extension function and its features
 *
 * @author Ranjith Krishnamurthy
 */
class TwoInts(val firstNumber: Int, val secondNumber: Int) : TwoObjects() {
    fun add(): Int {
        return firstNumber + secondNumber
    }

    fun mul(): Int {
        return firstNumber * secondNumber
    }

    /**
     * Demonstrates the extension function defined in the same class as the extension receiver class
     */
    fun TwoInts.myExt() {
        println("My Extension $firstNumber $this ${this@TwoInts}")
    }
}