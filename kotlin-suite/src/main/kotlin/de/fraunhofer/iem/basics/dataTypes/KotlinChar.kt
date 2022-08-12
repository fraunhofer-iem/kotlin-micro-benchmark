package de.fraunhofer.iem.basics.dataTypes

import java.io.File

/**
 * Demonstrates Char in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val ch1: Char = File.pathSeparatorChar
    var ch2: Char? = null

    println(ch1)
    ch2 = File.separatorChar
    println(ch2)

    val ch3 = '5'
    println(ch3.digitToInt())
}