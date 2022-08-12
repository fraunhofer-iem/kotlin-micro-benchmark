package de.fraunhofer.iem.generics.upperBounds.inGenericFunctions

import de.fraunhofer.iem.uniqueToKotlin.declarationSiteVarianceAndTypeProjetion.typeProjection.DifferentTypedPair

/**
 * Demonstrates the upper bound in the generic function in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun <A : Number, B : CharSequence> createDifferentTypedPair(first: A, second: B): DifferentTypedPair<A, B> {
    return DifferentTypedPair<A, B>(first, second);
}

/**
 * Demonstrates the usage of the upper bounded generic function in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    println(createDifferentTypedPair<Int, String>(2646, "Ranjith"))
}