package de.fraunhofer.iem.basics.controlFlow.returnsAndJumps

/**
 * Demonstrates continue in single for loop in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun singleLoopContinue(range: Int) {
    for (i in 0 until range) {
        if (i % 2 == 0) continue

        println(i)
    }
}

/**
 * Demonstrates two continue statements in double for loop in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun doubleLoopContinue(range: Int) {
    for (i in 0 until range) {
        if (i % 2 == 0) continue

        for (j in 0 until range) {
            if (j % 2 != 0) continue

            println("$i --> $j")
        }
    }
}

/**
 * Demonstrates single continue statement in double for loop in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun doubleLoopSingleContinue(range: Int) {
    for (i in 0 until range) {
        for (j in 0 until range) {
            if (j % 2 != 0) continue

            println("$i --> $j")
        }
    }
}

fun main() {
    singleLoopContinue(50)
    doubleLoopContinue(5)
    doubleLoopSingleContinue(5)
}