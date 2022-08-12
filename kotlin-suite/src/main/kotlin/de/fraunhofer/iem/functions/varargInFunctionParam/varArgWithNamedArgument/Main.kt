package de.fraunhofer.iem.functions.varargInFunctionParam.varArgWithNamedArgument

/**
 * Demonstrates the vararg in middle (not the last parameter)
 *
 * @author Ranjith Krishnamurthy
 */
private fun print(preMessage: String, vararg messages: String, postMessage: String) {
    println(preMessage)
    for (message in messages) {
        println(message)
    }
    println(postMessage)
}

fun main() {
    print("Beginning", postMessage = "End")
    print("Beginning", "Hello", "How are you", postMessage = "End")

    val messages = arrayOf("Hello", "How are you", "Where are you")
    print("Beginning", *messages, postMessage = "End")
}