package de.fraunhofer.iem.uniqueToKotlin.declarationSiteVarianceAndTypeProjetion.declarationSiteVariance.coVariant

/**
 * Implements the interface that has the co-variant declaration site variance
 */
data class DifferentTypedPairImpl<A, B>(private var first: A, private var second: B): DifferentTypedPair<A, B> {
    override fun first(): A = this.first

    override fun second(): B = this.second

}

fun main() {
    val ob: DifferentTypedPair<String, String> = DifferentTypedPairImpl<String, String>("", "dsdg")
    dummy(ob)
}

/**
 * Demonstrates the co-variant usage
 */
fun dummy(ob: DifferentTypedPair<String, String>) {
    val obj: DifferentTypedPair<Any, Any> = ob

    println(obj)
    println(ob)
}