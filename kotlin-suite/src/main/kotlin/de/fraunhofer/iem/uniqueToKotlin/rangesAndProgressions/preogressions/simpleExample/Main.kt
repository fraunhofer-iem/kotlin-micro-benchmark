package de.fraunhofer.iem.uniqueToKotlin.rangesAndProgressions.preogressions.simpleExample

/**
 * Demonstrates the IntProgression
 *
 * @author Ranjith Krishnamurthy
 */
fun printIntProgressions(progression: IntProgression) {
    println("\n*** $progression ***")

    for (i in progression) {
        print("$i, ")
    }
}

/**
 * Demonstrates the CharProgression
 *
 * @author Ranjith Krishnamurthy
 */
fun printCharProgressions(progression: CharProgression) {
    println("\n*** $progression ***")

    for (i in progression) {
        print("$i, ")
    }
}

/**
 * Demonstrates the LongProgression
 *
 * @author Ranjith Krishnamurthy
 */
fun printLongProgressions(progression: LongProgression) {
    println("\n*** $progression ***")

    for (i in progression) {
        print("$i, ")
    }
}

/**
 * Demonstrates the ULongProgression
 *
 * @author Ranjith Krishnamurthy
 */
fun printULongProgressions(progression: ULongProgression) {
    println("\n*** $progression ***")

    for (i in progression) {
        print("$i, ")
    }
}

/**
 * Demonstrates the UIntProgression
 *
 * @author Ranjith Krishnamurthy
 */
fun printUIntProgressions(progression: UIntProgression) {
    println("\n*** $progression ***")

    for (i in progression) {
        print("$i, ")
    }
}

fun main() {
    printIntProgressions(1..10 step 2)
    printCharProgressions('A'..'Z' step 5)
    printLongProgressions(1L..10L step 2)
    printULongProgressions(1UL..10UL step 3)
    printUIntProgressions(1U..10U step 4)

    printIntProgressions(10 downTo 1)
    printCharProgressions('Z' downTo 'A' step 10)
    printLongProgressions(10L downTo 1L step 2)
    printULongProgressions(10UL downTo 1UL step 3)
    printUIntProgressions(10U downTo 1U step 4)
}