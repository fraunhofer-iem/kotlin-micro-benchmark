package de.fraunhofer.iem.uniqueToKotlin.highOrderFunctions.simpleExample

/**
 * This is a high order function example, that takes a function as a parameter,
 *
 * Note:
 * 1. This example is taken from the https://kotlinlang.org/docs/lambdas.html#higher-order-functions
 */
fun <T, R> fold(
    collections: Collection<T>,
    initial: R,
    combine: (acc: R, nextElement: T) -> R
): R {
    var accumulator: R = initial
    for (element: T in collections) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}


fun main() {
    val items = listOf(1, 2, 3, 4, 5)

    val func: (String, Int) -> String = { acc, i ->
        "$acc $i"
    }

    fold(items, 0) { acc: Int, i: Int ->
        print("acc = $acc, i = $i, ")
        val result = acc + i
        println("result = $result")

        result
    }

    val joinedToString = fold(items, "Elements:", func)

    val product = fold(items, 1, Int::times)
}