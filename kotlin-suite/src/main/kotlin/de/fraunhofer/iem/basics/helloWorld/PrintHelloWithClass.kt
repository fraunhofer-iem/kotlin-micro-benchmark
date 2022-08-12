package de.fraunhofer.iem.basics.helloWorld

/**
 * Demonstrates simple hello world program by creating class in kotlin.
 *
 * @author Ranjith Krishnamurthy
 */
class PrintHelloWithClass {
    fun printHello(): Unit {
        println("Hello World with creating class")
    }
}

/**
 * Main method, outside the class to call the printHelloWithClass
 */
fun main() {
    val obj = PrintHelloWithClass()
    obj.printHello()
}