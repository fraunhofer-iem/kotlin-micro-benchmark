package de.fraunhofer.iem.uniqueToKotlin.extensions.extensionCompanion

/**
 * This is a helper class to demonstrate the extension companion object
 *
 * @author Ranjith Krishnamurthy
 */
class TwoInts(val firstNumber: Int, val secondNumber: Int) {
    fun add(): Int {
        return firstNumber + secondNumber
    }

    companion object TwoIntsCompanion {
        fun mul(firstNumber: Int, secondNumber: Int): Int {
            return firstNumber * secondNumber
        }
    }
}