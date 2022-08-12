package de.fraunhofer.iem.collections.iterators.iterable.inCollection

import kotlin.collections.HashSet

/**
 * Demonstrates the collection iterator
 *
 * @author Ranjith Krishnamurthy
 */
private fun withIterators(collection: Collection<String>) {
    val itr = collection.iterator()

    while (itr.hasNext()) {
        val elem = itr.next()
        println(elem)
    }
}

/**
 * Demonstrates the collection iterator using for loop
 *
 * @author Ranjith Krishnamurthy
 */
private fun withFor(collection: Collection<String>) {
    for (elem in collection) {
        println(elem)
    }
}

/**
 * Demonstrates the forEach in collection
 *
 * @author Ranjith Krishnamurthy
 */
private fun withForEach(collection: Collection<String>) {
    collection.forEach { it: String ->
        val upStr = it.uppercase()
        println(upStr)
    }
}

fun main() {
    val lst: List<String> = mutableListOf<String>("Ranjith", "K")
    val set: Set<String> = HashSet(lst)

    withIterators(lst)
    withIterators(set)

    withFor(lst)
    withFor(set)

    withForEach(lst)
    withForEach(set)
}