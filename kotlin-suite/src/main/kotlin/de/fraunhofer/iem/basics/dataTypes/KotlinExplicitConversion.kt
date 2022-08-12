package de.fraunhofer.iem.basics.dataTypes

/**
 * Demonstrates the explicit conversion of type in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val num1: Byte = getNumber("float").toByte()
    val num2: Short = num1.toShort()
    val num3: Int = getNumber("long").toInt()
    val num4: Long = getNumber("long").toLong()
    val num5: Float = getNumber("float").toFloat()
    val num6: Double = getNumber("double").toDouble()

    val dup1: Int = getNumber("what").toDouble().toInt()
    val dup2: Double = getNumber("what").toInt().toDouble()

    println("$num1 : $num2 : $num3 : $num4 : $num5 : $num6 : $dup1 : $dup2")
}