package de.fraunhofer.iem.generics.upperBounds.inGenericClass

/**
 * Demonstrates the upperbound in generics class in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
data class CustomPair<A, B>(val first: A, val second: B) where A : Number,
                                                               B : CharSequence,
                                                               B : Comparable<B>