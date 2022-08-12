package de.fraunhofer.iem.uniqueToKotlin.rangesAndProgressions.ranges.inCustomClass

import de.fraunhofer.iem.uniqueToKotlin.rangesAndProgressions.preogressions.inCustomClass.MyIntProgression

/**
 * Demonstrates the custom range
 *
 * @author Ranjith Krishnamurthy
 */
class MyIntRange(override val start: MyInt, override val endInclusive: MyInt) :
    MyIntProgression(start, endInclusive, MyInt(1)),
    ClosedRange<MyInt> {
}