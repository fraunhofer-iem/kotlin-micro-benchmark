package de.fraunhofer.iem.uniqueToKotlin.extensions.extensionCompanion

/**
 * Demonstrates the extension companion object
 *
 * @author Ranjith Krishnamurthy
 */
fun TwoInts.TwoIntsCompanion.sub(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

/**
 * Demonstrates the usage of the extension companion object
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val twoInts: TwoInts = TwoInts(10, 20)

    println(twoInts.add())

    println(TwoInts.mul(10 ,20))
    println(TwoInts.TwoIntsCompanion.mul(10 ,20))

    println(TwoInts.sub(10 ,20))
    println(TwoInts.TwoIntsCompanion.sub(10 ,20))
}