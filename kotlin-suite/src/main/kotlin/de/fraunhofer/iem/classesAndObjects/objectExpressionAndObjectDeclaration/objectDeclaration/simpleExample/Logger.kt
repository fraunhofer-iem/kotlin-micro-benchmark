package de.fraunhofer.iem.classesAndObjects.objectExpressionAndObjectDeclaration.objectDeclaration.simpleExample

/**
 * Demonstrates the object declaration in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
object Logger {
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
}