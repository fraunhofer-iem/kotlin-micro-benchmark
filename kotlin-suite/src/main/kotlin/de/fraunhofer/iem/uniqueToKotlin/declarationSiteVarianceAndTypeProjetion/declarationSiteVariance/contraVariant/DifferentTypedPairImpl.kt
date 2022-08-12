package de.fraunhofer.iem.uniqueToKotlin.declarationSiteVarianceAndTypeProjetion.declarationSiteVariance.contraVariant

/**
 * Implements the interface that has the co-variant declaration site variance
 */
data class DifferentTypedPairImpl<A, B>(var first: A, var second: B) : DifferentTypedPair<A, B> {
    override fun replace(first: A, second: B) {
        this.first = first
        this.second = second
    }
}

fun main() {
    val ob: DifferentTypedPair<Any, Any> = DifferentTypedPairImpl<Any, Any>(Any(), Any())
    dummy(ob)
}

/**
 * Demonstrates the co-variant usage
 */
fun dummy(ob: DifferentTypedPair<Any, Any>) {
    val obj: DifferentTypedPair<String, String> = ob

    println(obj)
    println(ob)
}