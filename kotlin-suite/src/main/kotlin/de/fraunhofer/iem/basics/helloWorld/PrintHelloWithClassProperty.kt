package de.fraunhofer.iem.basics.helloWorld

/**
 * Demonstrates the simple hello world program with the class that contains name property
 *
 * @author Ranjith Krishnamurthy
 */
class PrintHelloWithClassProperty(private val name: String) {
    /**
     * Prints the Hello world using the name property
     */
    public fun printHello(): Unit {
        println("Hello " + this.name + "!!!")
    }
}

/**
 * Main method
 */
fun main() {
    val printer: PrintHelloWithClassProperty = PrintHelloWithClassProperty("Ranjith")
    printer.printHello()
}