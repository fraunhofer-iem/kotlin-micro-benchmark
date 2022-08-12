package de.fraunhofer.iem.basics.dataTypes

import java.io.File

/**
 * Main method
 *
 * Demonstrates the basic types in kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val num1: Byte = getNumber("byte").toByte();
    val num2: Short = getNumber("short").toShort();
    val num3: Int = getNumber("int").toInt();
    val num4: Long = getNumber("long").toLong();
    val num5: Float = getNumber("float").toFloat();
    val num6: Double = getNumber("double").toDouble();

    val singleCharacter = getChar();
    val flag = Integer.TYPE.isPrimitive;

    val str = getString()

    println("$num1 : $num2 : $num3 : $num4 : $num5 : $num6 : $singleCharacter : $str : $flag")
}

/**
 * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
 */
fun getChar(): Char {
    return File.separatorChar
}

/**
 * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
 */
fun getString(): String {
    return File.pathSeparator;
}

/**
 * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
 */
fun getNumber(type: String): Number {
    when (type) {
        "byte" -> return 1;
        "short" -> return 12;
        "int" -> return 10;
        "long" -> return 12342;
        "float" -> return 10.4F;
        "double" -> return 10.4;
    }
    return 0;
}