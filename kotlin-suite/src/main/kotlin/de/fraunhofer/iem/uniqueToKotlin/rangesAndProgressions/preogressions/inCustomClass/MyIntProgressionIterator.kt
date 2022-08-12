package de.fraunhofer.iem.uniqueToKotlin.rangesAndProgressions.preogressions.inCustomClass

import de.fraunhofer.iem.uniqueToKotlin.rangesAndProgressions.ranges.inCustomClass.MyInt

/**
 * Demonstrates the custom progression iterator
 *
 * @author Ranjith Krishnamurthy
 */
class MyIntProgressionIterator(private val start: MyInt, private val endInclusive: MyInt, private val step: MyInt) :
    Iterator<MyInt> {
    private var currentCursor: Int = -1
    private var nextCursor: Int = start.value

    override fun hasNext(): Boolean {
        return nextCursor <= endInclusive.value
    }

    override fun next(): MyInt {
        if (hasNext()) {
            currentCursor = nextCursor
            nextCursor += step.value

            return MyInt(currentCursor)
        }

        return MyInt(0)
    }
}