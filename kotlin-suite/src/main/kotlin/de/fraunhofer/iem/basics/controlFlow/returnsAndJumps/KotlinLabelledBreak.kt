package de.fraunhofer.iem.basics.controlFlow.returnsAndJumps

/**
 * Demonstrates labelled break in single for loop in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun singleLoopLabelledBreak(range: Int) {
    loop1@
    for (i in 0 until range) {
        if (i == 5) break@loop1

        println(i)
    }
}

/**
 * Demonstrates two labelled break statements in double for loop in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun doubleLoopLabelledBreak(range: Int) {
    loop1@
    for (i in 0 until range) {
        if (i == 5) break@loop1

        loop2@
        for (j in 0 until range) {
            if (j % 2 != 0) break@loop1

            println("$i --> $j")
        }
    }
}

/**
 * Demonstrates single labelled break statement in double for loop in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun doubleLoopSingleLabelledBreak(range: Int) {
    loop@
    for (i in 0 until range) {
        for (j in 0 until range) {
            if (j % 2 != 0) break@loop

            println("$i --> $j")
        }
    }
}

fun main() {
    singleLoopLabelledBreak(50)
    doubleLoopLabelledBreak(5)
    doubleLoopSingleLabelledBreak(5)
}