package de.fraunhofer.iem.basics.controlFlow.returnsAndJumps

/**
 * Demonstrates break in single for loop in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun singleLoopBreak(range: Int) {
    for (i in 0 until range) {
        if (i == 5) break
        println(i)
    }
}

/**
 * Demonstrates two break statements in double for loop in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun doubleLoopBreak(range: Int) {
    for (i in 0 until range) {
        if (i == 5) break
        for (j in 0 until range) {
            if (j % 2 != 0) break
            println("$i --> $j")
        }
    }
}

/**
 * Demonstrates single break statement in double for loop in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun doubleLoopSingleBreak(range: Int) {
    for (i in 0 until range) {
        for (j in 0 until range) {
            if (j % 2 != 0) break
            println("$i --> $j")
        }
    }
}

fun main() {
    singleLoopBreak(50)
    doubleLoopBreak(5)
    doubleLoopSingleBreak(5)
}