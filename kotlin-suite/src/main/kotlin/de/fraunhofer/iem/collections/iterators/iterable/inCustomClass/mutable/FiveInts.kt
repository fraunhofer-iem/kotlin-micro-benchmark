package de.fraunhofer.iem.collections.iterators.iterable.inCustomClass.mutable

/**
 * Demonstrates the custom class implements the MutableIterable in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
class FiveInts(first: Int, second: Int, third: Int, fourth: Int, fifth: Int) : MutableIterable<Int> {
    private val data = IntArray(5)

    override fun iterator(): MutableIterator<Int> {
        return FiveIntsIterator()
    }

    private inner class FiveIntsIterator : MutableIterator<Int> {
        var currentCursor = -1
        var nextCursor = 0

        override fun hasNext(): Boolean {
            return currentCursor < SIZE - 1
        }

        override fun next(): Int {
            nextCursor = ++currentCursor
            return data[nextCursor]
        }

        override fun remove() {
            println("Remove function is under development for now")
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