package de.fraunhofer.iem.uniqueToKotlin.highOrderFunctions.implementsFunctionType

/**
 * Demonstrate the class that implements the function type in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
class NamePrinter : (String) -> Unit {
    override fun invoke(name: String) {
        println("Hello $name")
    }
}