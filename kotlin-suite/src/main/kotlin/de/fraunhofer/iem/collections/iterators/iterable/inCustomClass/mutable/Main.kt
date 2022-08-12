package de.fraunhofer.iem.collections.iterators.iterable.inCustomClass.mutable

/**
 * Demonstrates the usage of the custom class that implements the MutableIterable in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val fiveInts = FiveInts(1, 2, 3, 4, 5)

    val itr: MutableIterator<Int> = fiveInts.iterator()

    while (itr.hasNext()) {
        val elem = itr.next()
        println(elem)

        itr.forEachRemaining { x: Int? -> println(x) }
        itr.remove()
    }

    fiveInts.forEach { x: Int? -> println(x) }
}