package de.fraunhofer.iem.generics.rawTypes

import de.fraunhofer.iem.uniqueToKotlin.declarationSiteVarianceAndTypeProjetion.declarationSiteVariance.coVariant.DifferentTypedPair
import de.fraunhofer.iem.uniqueToKotlin.declarationSiteVarianceAndTypeProjetion.declarationSiteVariance.coVariant.DifferentTypedPairImpl

/**
 * Demonstrates the star projection in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val differentTypedPair: DifferentTypedPair<Int, String> = DifferentTypedPairImpl(120, "Ranjith")
    val temp: DifferentTypedPair<*, *> = differentTypedPair
    try {
        // Can not cast, because typ system is broken because of the star projection (and unsafe cast operator)
        println((temp.second() as Double).toInt())
    } catch (ex: Exception) {
        println(ex.message)
    }
}