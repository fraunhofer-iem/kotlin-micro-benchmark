package de.fraunhofer.iem.uniqueToKotlin.highOrderFunctions.callableReference

/**
 * Top level function to refer
 *
 * @author Ranjith Krishnamurthy
 */
fun skateStreet(name: String) {
    println("$name Skating Street")
}

/**
 * Extension function to refer
 *
 * @author Ranjith Krishnamurthy
 */
fun Person.skateStreet(name: String) {
    println("$name Skating Street")
}

/**
 * High order function
 *
 * @author Ranjith Krishnamurthy
 */
fun whatAreYouDoing(answer: () -> Unit) {
    answer()
    answer.invoke()
}

/**
 * High order function
 *
 * @author Ranjith Krishnamurthy
 */
fun whatAreYouDoing(answer: (String) -> Unit) {
    answer("Ranjith")
    answer.invoke("Ranjith")
}

fun main() {
    val ranjith = Person("Ranjith")

    // Local function
    fun dummy() {
        println("Doing Nothing")
    }

    whatAreYouDoing(::dummy)                // Local function refer
    whatAreYouDoing(ranjith::skate)         // Member function refer
    whatAreYouDoing(ranjith::skateStreet)   // Extension function refer
    whatAreYouDoing(::skateStreet)          // top level function refer
    whatAreYouDoing(::Person)               // Constructor refer
}
