package de.fraunhofer.iem.collections.iterators.iterable.inCustomClass

/**
 * Demonstrates the custom class implements the Iterable (read only) in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
class FiveInts(first: Int, second: Int, third: Int, fourth: Int, fifth: Int) : Iterable<Int> {
    private val data = IntArray(5)

    override fun iterator(): Iterator<Int> {
        return FiveIntsIterator()
    }

    private inner class FiveIntsIterator : Iterator<Int> {
        var currentCursor = -1
        var nextCursor = 0

        override fun hasNext(): Boolean {
            return currentCursor < SIZE - 1
        }

        override fun next(): Int {
            nextCursor = ++currentCursor
            return data[nextCursor]
        }
    }

    companion object {
        private const val SIZE = 5
    }

    init {
        data[0] = first
        data[1] = second
        data[2] = third
        data[3] = fourth
        data[4] = fifth
    }
}