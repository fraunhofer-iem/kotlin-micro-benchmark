package de.fraunhofer.iem.uniqueToKotlin.highOrderFunctions.implementsFunctionType

/**
 * Demonstrate the usage of the class that implements the Function type.
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val namePrinter: (String) -> Unit = NamePrinter()

    namePrinter("Ranjith")
    namePrinter.invoke("Ranjith")
}