package de.fraunhofer.iem.uniqueToKotlin.declarationSiteVarianceAndTypeProjetion.declarationSiteVariance.contraVariant

/**
 * Demonstrates the declaration site variance with contra-variant
 *
 * @author Ranjith Krishnamurthy
 */
interface DifferentTypedPair<in A, in B> {
    // type projection
    fun replace(first: A, second: B)
}
