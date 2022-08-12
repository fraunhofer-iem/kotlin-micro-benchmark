package de.fraunhofer.iem.uniqueToKotlin.declarationSiteVarianceAndTypeProjetion.typeProjection

/**
 * Demonstrates the type projection in member of a generic class
 *
 * @author Ranjith Krishnamurthy
 */
data class DifferentTypedPair<A, B>(var first: A, var second: B) {
    // type projection
    fun replace(ob: DifferentTypedPair<out A, out B>) {
        this.first = ob.first
        this.second = ob.second
    }
}
