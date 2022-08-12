package de.fraunhofer.iem.uniqueToKotlin.highOrderFunctions.functionWithNParameters

/**
 * This is a high order function example, that takes a function with more than 22 parameters,
 * for that it uses FunctionN interface with invoke(vararg of Any?)
 *
 * Note:
 * 1. This example is taken from the https://kotlinlang.org/docs/lambdas.html#higher-order-functions
 */
fun <T, R> fold(
    collections: Collection<T>,
    initial: R,
    combine: (
        acc: R, nextElement: T,
        dummy1: T, dummy2: T, dummy3: T, dummy4: T, dummy5: T,
        dummy6: T, dummy7: T, dummy8: T, dummy9: T, dummy10: T,
        dummy11: T, dummy12: T, dummy13: T, dummy14: T, dummy15: T,
        dummy16: T, dummy17: T, dummy18: T, dummy19: T, dummy20: T,
        dummy21: T, dummy22: T, dummy23: T, dummy24: T, dummy25: T
    ) -> R
): R {
    var accumulator: R = initial
    for (element: T in collections) {
        accumulator = combine(
            accumulator, element,
            element, element, element, element, element,
            element, element, element, element, element,
            element, element, element, element, element,
            element, element, element, element, element,
            element, element, element, element, element
        )
    }
    return accumulator
}


fun main() {
    val items = listOf(1, 2, 3, 4, 5)

    fold(items, 0) { acc: Int, i: Int,
                     _: Int, _: Int, _: Int, _: Int, _: Int,
                     _: Int, _: Int, _: Int, _: Int, _: Int,
                     _: Int, _: Int, _: Int, _: Int, _: Int,
                     _: Int, _: Int, _: Int, _: Int, _: Int,
                     dummy21: Int, dummy22: Int, dummy23: Int, dummy24: Int, dummy25: Int ->
        print("acc = $acc, i = $i, ")
        val result = acc + i
        println("result = $result")

        result
    }
}