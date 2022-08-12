package de.fraunhofer.iem.uniqueToKotlin.rangesAndProgressions.ranges.simpleExample

/**
 * Demonstrates the IntRange
 *
 * @author Ranjith Krishnamurthy
 */
fun printIntRanges(range: IntRange) {
    println("\n*** $range ***")

    for (i in range) {
        print("$i, ")
    }
}

/**
 * Demonstrates the CharRange
 *
 * @author Ranjith Krishnamurthy
 */
fun printCharRanges(range: CharRange) {
    println("\n*** $range ***")

    for (i in range) {
        print("$i, ")
    }
}

/**
 * Demonstrates the LongRange
 *
 * @author Ranjith Krishnamurthy
 */
fun printLongRanges(range: LongRange) {
    println("\n*** $range ***")

    for (i in range) {
        print("$i, ")
    }
}

/**
 * Demonstrates the ULongRange
 *
 * @author Ranjith Krishnamurthy
 */
fun printULongRanges(range: ULongRange) {
    println("\n*** $range ***")

    for (i in range) {
        print("$i, ")
    }
}

/**
 * Demonstrates the UIntRange
 *
 * @author Ranjith Krishnamurthy
 */
fun printUIntRanges(range: UIntRange) {
    println("\n*** $range ***")

    for (i in range) {
        print("$i, ")
    }
}

fun main() {
    printIntRanges(1..10)
    printCharRanges('A'..'Z')
    printLongRanges(1L..10L)
    printULongRanges(1UL..10UL)
    printUIntRanges(1U..10U)

    printIntRanges(1 until 10)
    printCharRanges('A' until 'Z')
    printLongRanges(1L until 10L)
    printULongRanges(1UL until 10UL)
    printUIntRanges(1U until 10U)
}