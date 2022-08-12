package de.fraunhofer.iem.basics.equality.withEqualsAndHashCode

/**
 * Demonstrate the structural and referential equality on the class that implements equals and hashcode (data class) in Kotlin
 *
 * Note:
 * 1. In this case, structural equality does not behave like a referential equality
 * 2. Structural equality uses equals to check for the content depending on the implementation of the equals
 * 3. Kotlin calls the kotlin.jvm.Intrinsics areEqual method in turn calls the equals
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val ranjith1 = Person(
        "Ranjith",
        "Street 102",
        100,
        "+49 99999 9999"
    )

    val ranjith2 = Person(
        "Ranjith",
        "Street 102",
        100,
        "+49 99999 9999"
    )

    val ranjith3 = Person(
        "Ranjith3",
        "Street 1023",
        1003,
        "+49 99999 999933"
    )

    println(ranjith1 === ranjith2)
    println(ranjith1 === ranjith3)
    println(ranjith1 === ranjith1)

    println(ranjith1 == ranjith2)
    println(ranjith1 == ranjith3)
    println(ranjith1 == ranjith1)
}