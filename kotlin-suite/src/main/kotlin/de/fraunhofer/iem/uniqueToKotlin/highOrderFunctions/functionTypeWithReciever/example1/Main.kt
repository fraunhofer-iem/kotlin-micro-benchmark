package de.fraunhofer.iem.uniqueToKotlin.highOrderFunctions.functionTypeWithReciever.example1

/**
 * Function type with receiver object
 *
 * @author Ranjith Krishnamurthy
 */
val sum: Int.(Int) -> Int = { other ->
    println("Summing $this and $other")
    plus(other)
}

/**
 * Anonymous function with receiver object
 *
 * @author Ranjith Krishnamurthy
 */
val add = fun Int.(other: Int): Int {
    println("Adding $this and $other")
    return this + other
}

fun main() {
    println(2.sum(2))
    println(sum(20, 20))

    println(2.add(2))
    println(add(20, 20))
}