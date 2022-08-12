package de.fraunhofer.iem.classesAndObjects.objectExpressionAndObjectDeclaration.objectDeclaration.inheritsClass

import de.fraunhofer.iem.classesAndObjects.objectExpressionAndObjectDeclaration.anonymousObjectOfSomeType.HelloWorldPrinter
import de.fraunhofer.iem.classesAndObjects.objectExpressionAndObjectDeclaration.anonymousObjectOfSomeType.PrintAnything

/**
 * Demonstrates the object declaration that inherits in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
object Logger : HelloWorldPrinter(), PrintAnything {
    const val appName = "MyApp"

    fun logWarn(message: String) {
        println("($appName) Logging Warning: $message")
    }

    fun logError(message: String) {
        println("($appName) Logging Error: $message")
    }

    fun logInfo(message: String) {
        println("($appName) Logging Info: $message")
    }

    override fun print(message: String) {
        println(message)
    }

    override fun greet() {
        println("Hello $appName")
    }
}