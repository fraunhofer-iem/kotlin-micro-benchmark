package de.fraunhofer.iem.functions.varargInFunctionParam

/**
 * Demonstrates the vararg on string in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun print(vararg messages: String) {
    for (message in messages) {
        println(message)
    }
}

/**
 * Demonstrates the vararg on List in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
private fun printList(vararg lst: List<String>) {
    for (ls in lst) {
        for (elem in ls) {
            println(elem)
        }
    }
}

fun main() {
    print()
    print("Hello", "How are you")
    print("Hello", "How are you", "Where are you")

    printList(
        mutableListOf("Hello", "How are you", "Where are you"),
        mutableListOf("Hello", "How are you"),
        mutableListOf("Where are you")
    )
}