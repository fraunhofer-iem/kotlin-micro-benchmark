package de.fraunhofer.iem.generics.genericFunctions

import de.fraunhofer.iem.uniqueToKotlin.declarationSiteVarianceAndTypeProjetion.typeProjection.DifferentTypedPair

/**
 * Demonstrates the generic function in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun <A, B> createDifferentTypedPair(first: A, second: B): DifferentTypedPair<A, B> {
    return DifferentTypedPair<A, B>(first, second);
}

/**
 * Demonstrates the usage of the generic function in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    println(createDifferentTypedPair<Int, Double>(2646, 542.548))
}