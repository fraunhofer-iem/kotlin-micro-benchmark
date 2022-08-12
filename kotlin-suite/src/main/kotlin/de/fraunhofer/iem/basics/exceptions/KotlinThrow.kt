package de.fraunhofer.iem.basics.exceptions

/**
 * In Kotlin there is no checked exception, even if we do not catch or throw the exception from the checkValid method,
 * compiler will not give error.
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    checkValid("Ranjith")
    checkValid("ranj345n")
}

/**
 * Throws a Exception
 *
 * @author Ranjith Krishnamurthy
 */
private fun checkValid(name: String) {
    if (name.matches(Regex(".*\\d.*"))) {
        throw Exception("Invalid name")
    }
}