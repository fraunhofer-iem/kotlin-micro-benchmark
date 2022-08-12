package de.fraunhofer.iem.uniqueToKotlin.extensions.extensionFunctions.extenstionToCollections

/**
 * Demonstrates the extension function (Zero parameter) to a mutable list
 *
 * @author Ranjith Krishnamurthy
 */
fun MutableList<Int>.customizedMax(): Int {
    var maxElem: Int = 0

    for (elem in this) {
        if (elem > maxElem) {
            maxElem = elem
        }
    }

    return maxElem
}

/**
 * Demonstrates the extension function (Two parameters) to a mutable list
 *
 * @author Ranjith Krishnamurthy
 */
fun <T> MutableList<T>.customizedSwap(firstIndex: Int, secondIndex: Int) {
    if (firstIndex >= this.size) {
        println("$firstIndex is greater than the size of the list")
        return
    }

    if (secondIndex >= this.size) {
        println("$secondIndex is greater than the size of the list")
        return
    }

    val temp: T = this[firstIndex]
    this[firstIndex] = this[secondIndex]
    this[secondIndex] = temp
}

/**
 * Demonstrates the usage of the defined extension functions in the same package
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val list = mutableListOf<Int>(234, 2, 1, 0, 23423, 2, 423, 9123, 23342)

    println("List = $list")
    println("Max = ${list.customizedMax()}")
    list.customizedSwap(4, 0)
    println("List after swap = $list")
}