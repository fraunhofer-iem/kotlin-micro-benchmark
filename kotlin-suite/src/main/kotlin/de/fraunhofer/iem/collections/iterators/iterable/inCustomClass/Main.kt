package de.fraunhofer.iem.collections.iterators.iterable.inCustomClass

/**
 * Demonstrates the usage of the custom class that implements the Iterable (read only) in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val fiveInts = FiveInts(1, 2, 3, 4, 5)

    val itr = fiveInts.iterator()

    while (itr.hasNext()) {
        val elem = itr.next()
        println(elem)

        itr.forEachRemaining { x: Int? -> println(x) }
    }

    fiveInts.forEach { x: Int? -> println(x) }
}