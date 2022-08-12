package de.fraunhofer.iem.uniqueToKotlin.highOrderFunctions.implementsFunctionType.moreThan22Parameters

/**
 * Demonstrate the usage of the class that implements the Function type with more than 22 parameters.
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val namePrinter: (
        String, String, String, String, String,
        String, String, String, String, String,
        String, String, String, String, String,
        String, String, String, String, String,
        String, String, String, String, String
    ) -> String = NamePrinter()

    println(
        namePrinter(
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith"
        )
    )
    println(
        namePrinter.invoke(
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith",
            "Ranjith"
        )
    )
}