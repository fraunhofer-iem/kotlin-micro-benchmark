package de.fraunhofer.iem.classesAndObjects.objectExpressionAndObjectDeclaration.anonymousObjectOfSomeType

/**
 * Class to demonstrate the anonymous object of this class
 *
 * @author Ranjith Krishnamurthy
 */
open class HelloWorldPrinter {
    open fun greet() {
        println("Hello!! Welcome to Kotlin!")
    }
}

/**
 * Interface to demonstrate the anonymous object of this interface
 *
 * @author Ranjith Krishnamurthy
 */
interface PrintAnything {
    fun print(message: String)
}

// Demonstrate the access of the top level property inside the anonymous class
const val name: String = "Ranjith"

/**
 * Demonstrate the anonymous object of different types
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    // Anonymous object of HelloWorldPrinter class
    val ob1 = object : HelloWorldPrinter() {
        @Override
        override fun greet() {
            println("Hello!! $name!")
        }
    }

    printHelloWorld(ob1)

    // Anonymous object of PrintAnything class
    val ob2 = object : PrintAnything {
        @Override
        override fun print(message: String) {
            println(message)
        }
    }

    printAnythingFunction(ob2)

    // Anonymous object of HelloWorldPrinter as well as PrintAnything class
    val ob3 = object : HelloWorldPrinter(), PrintAnything {
        @Override
        override fun greet() {
            println("Hello!! $name!")
        }

        @Override
        override fun print(message: String) {
            println(message)
        }
    }

    printHelloWorld(ob3)
    printAnythingFunction(ob3)
}

private fun printHelloWorld(helloWorldPrinter: HelloWorldPrinter) {
    helloWorldPrinter.greet()
}

private fun printAnythingFunction(printAnything: PrintAnything) {
    printAnything.print("Hi, how are you?")
}