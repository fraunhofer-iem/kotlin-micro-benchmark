package de.fraunhofer.iem.uniqueToKotlin.declarationSiteVarianceAndTypeProjetion.declarationSiteVariance.coVariant

/**
 * Demonstrates the declaration site variance with co-variant
 *
 * @author Ranjith Krishnamurthy
 */
interface DifferentTypedPair<out A, out B> {
    // type projection
    fun first(): A
    fun second(): B
}
