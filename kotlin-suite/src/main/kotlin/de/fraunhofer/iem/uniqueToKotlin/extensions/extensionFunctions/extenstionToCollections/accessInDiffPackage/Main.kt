package de.fraunhofer.iem.uniqueToKotlin.extensions.extensionFunctions.extenstionToCollections.accessInDiffPackage

import de.fraunhofer.iem.uniqueToKotlin.extensions.extensionFunctions.extenstionToCollections.customizedMax
import de.fraunhofer.iem.uniqueToKotlin.extensions.extensionFunctions.extenstionToCollections.customizedSwap

/**
 * Demonstrates the usage of the defined extension functions in the different package
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val list = mutableListOf<Int>(23342, 34, 928345798, 2, 1, 0, 23423, 2, 423, 9123)

    println("List = $list")
    println("Max = ${list.customizedMax()}")
    list.customizedSwap(2, 9)
    println("List after swap = $list")
}