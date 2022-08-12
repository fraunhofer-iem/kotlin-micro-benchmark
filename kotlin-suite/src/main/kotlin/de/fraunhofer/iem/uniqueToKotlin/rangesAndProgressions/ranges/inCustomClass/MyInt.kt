package de.fraunhofer.iem.uniqueToKotlin.rangesAndProgressions.ranges.inCustomClass

/**
 * Demonstrates the rangeTo operator (..) for custom class
 *
 * @author Ranjith Krishnamurthy
 */
data class MyInt(val value: Int) : Comparable<MyInt> {
    //TODO: Needs to check whether first is less than second
    operator fun rangeTo(end: MyInt): MyIntRange = MyIntRange(this, end)

    override fun compareTo(other: MyInt): Int {
        if (this.value < other.value)
            return -1

        if (this.value > other.value)
            return 1

        return 0
    }
}