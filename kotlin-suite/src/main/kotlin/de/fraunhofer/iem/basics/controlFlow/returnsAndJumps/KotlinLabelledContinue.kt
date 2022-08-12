package de.fraunhofer.iem.basics.controlFlow.returnsAndJumps

/**
 * Demonstrates labelled continue in single for loop in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun singleLoopLabelledContinue(range: Int) {
    loop1@
    for (i in 0 until range) {
        if (i % 2 == 0) continue@loop1

        println(i)
    }
}

/**
 * Demonstrates two labelled continue statements in double for loop in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun doubleLoopLabelledContinue(range: Int) {
    loop1@
    for (i in 0 until range) {
        if (i % 2 == 0) continue@loop1

        loop2@
        for (j in 0 until range) {
            if (j % 2 != 0) continue@loop1

            println("$i --> $j")
        }
    }
}

/**
 * Demonstrates single labelled continue statement in double for loop in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun doubleLoopSingleLabelledContinue(range: Int) {
    loop@
    for (i in 0 until range) {
        for (j in 0 until range) {
            if (j % 2 != 0) continue@loop

            println("$i --> $j")
        }
    }
}

fun main() {
    singleLoopLabelledContinue(50)
    doubleLoopLabelledContinue(5)
    doubleLoopSingleLabelledContinue(5)
}