package de.fraunhofer.iem.uniqueToKotlin.properties.lateInitProperty.inClass

/**
 * Demonstrates the lateinit in class property
 *
 * @author Ranjith Krishnamurthy
 */
class Dummy {
    lateinit var name: String

    fun main() {
        if (::name.isInitialized) {
            println("Yes, is initialized")

            return
        }

        println("No, not initialized")
    }
}

fun main() {
    Dummy().main()
}