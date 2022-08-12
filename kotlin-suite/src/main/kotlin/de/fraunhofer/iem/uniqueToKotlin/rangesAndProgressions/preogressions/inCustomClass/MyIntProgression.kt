package de.fraunhofer.iem.uniqueToKotlin.rangesAndProgressions.preogressions.inCustomClass

import de.fraunhofer.iem.uniqueToKotlin.rangesAndProgressions.ranges.inCustomClass.MyInt

/**
 * Demonstrates the custom progression
 *
 * @author Ranjith Krishnamurthy
 */
open class MyIntProgression(private val start: MyInt, private val endInclusive: MyInt, private val step: MyInt) :
    Iterable<MyInt> {
    override fun iterator(): Iterator<MyInt> {
        return MyIntProgressionIterator(start, endInclusive, step)
    }
}