package de.fraunhofer.iem.uniqueToKotlin.highOrderFunctions.functionTypeWithReciever.example2

/**
 * This example is taken from the https://kotlinlang.org/docs/lambdas.html#function-literals-with-receiver
 */
class HTML {
    fun body() {
        println("body")
    }
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()  // create the receiver object
    html.init()        // pass the receiver object to the lambda
    return html
}

fun main() {
    html {       // lambda with receiver begins here
        body()   // calling a method on the receiver object
    }
}
