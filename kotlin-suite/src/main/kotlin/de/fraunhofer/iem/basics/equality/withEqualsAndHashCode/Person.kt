package de.fraunhofer.iem.basics.equality.withEqualsAndHashCode

/**
 * Helper class for equality example
 *
 * @author Ranjith Krishnamurthy
 */
data class Person(
    var name: String,
    var address: String,
    var age: Int,
    var mobileNumber: String
)