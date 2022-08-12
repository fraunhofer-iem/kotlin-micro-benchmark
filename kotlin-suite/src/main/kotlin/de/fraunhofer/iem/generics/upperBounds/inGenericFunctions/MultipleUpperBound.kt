package de.fraunhofer.iem.generics.upperBounds.inGenericFunctions

import de.fraunhofer.iem.uniqueToKotlin.declarationSiteVarianceAndTypeProjetion.typeProjection.DifferentTypedPair

/**
 * Demonstrates the multiple upper bound in the generic function in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun <A : Number, B> createDifferentTypedPair1(first: A, second: B): DifferentTypedPair<A, B>
        where B : Comparable<B>,
              B : CharSequence {
    return DifferentTypedPair<A, B>(first, second);
}

/**
 * Demonstrates the usage of the multiple upper bounded generic function in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    println(createDifferentTypedPair1<Int, String>(2646, "Ranjith"))
}