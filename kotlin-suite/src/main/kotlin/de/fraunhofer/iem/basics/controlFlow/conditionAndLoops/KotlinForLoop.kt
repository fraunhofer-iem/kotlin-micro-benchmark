package de.fraunhofer.iem.basics.controlFlow.conditionAndLoops

/**
 * Demonstrates the for loop in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main(args: Array<String>) {
    forIterator(mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 20))
    forArray(args)
    forArrayWithIndex(args)
    forArrayWithIndexAndValue(args)
    forRangeExpr(1..10)
    forProgressionExpr(6 downTo 0 step 2)
}

/**
 * Demonstrates the for loop using iterator in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun forIterator(iter: Collection<Int>) {
    for (elem in iter) {
        println(elem)
    }
}

/**
 * Demonstrates the for loop for array
 *
 * @author Ranjith Krishnamurthy
 */
fun forArray(args: Array<String>) {
    for (elem in args) {
        println(elem)
    }
}

/**
 * Demonstrates the for loop for array using indices
 *
 * @author Ranjith Krishnamurthy
 */
fun forArrayWithIndex(args: Array<String>) {
    for (i in args.indices) {
        println(args[i])
    }
}

/**
 * Demonstrates the for loop for array with IndexedValue that is index as well as value at that index
 *
 * @author Ranjith Krishnamurthy
 */
fun forArrayWithIndexAndValue(args: Array<String>) {
    for ((i, elem) in args.withIndex()) {
        println("$i --> $elem")
    }
}

/**
 * Demonstrates the for loop using Range
 *
 * @author Ranjith Krishnamurthy
 */
fun forRangeExpr(range: IntRange) {
    for (i in range) {
        println(i)
    }
}

/**
 * Demonstrates the for loop using progression
 *
 * @author Ranjith Krishnamurthy
 */
fun forProgressionExpr(progress: IntProgression) {
    for (i in progress) {
        println(i)
    }
}