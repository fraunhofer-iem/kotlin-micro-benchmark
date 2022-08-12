package de.fraunhofer.iem.basics.dataTypes

/**
 * Demonstrates the Literals in Kotlin
 *
 * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
 */
private fun getDynamicNumber(type: String): Number {
    return when (type) {
        "n1" -> 123;
        "n2" -> 123L;
        "n3" -> 0x0F;
        "n4" -> 0b00001011;
        "r1" -> 123.5;
        "r2" -> 123.5e10;
        "r3" -> 123.5f;
        "r4" -> 123.554F;
        "mr1" -> 1_000_000;
        "mr2" -> 0b11111111_10001001_10111111;
        else -> 0;
    }
}

/**
 * Main method
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val n1 = getDynamicNumber("n1")
    val n2 = getDynamicNumber("n2")
    val n3 = getDynamicNumber("n3")
    val n4 = getDynamicNumber("n4")

    val r1 = getDynamicNumber("r1")
    val r2 = getDynamicNumber("r2")
    val r3 = getDynamicNumber("r3")
    val r4 = getDynamicNumber("r4")

    val mr1 = getDynamicNumber("mr1")
    val mr2 = getDynamicNumber("mr2")

    printLiteralVariables(n1)
    printLiteralVariables(n2)
    printLiteralVariables(n3)
    printLiteralVariables(n4)

    printLiteralVariables(r1)
    printLiteralVariables(r2)
    printLiteralVariables(r3)
    printLiteralVariables(r4)

    printLiteralVariables(mr1)
    printLiteralVariables(mr2)
}

/**
 * Prints the variables and its Kotlin type
 */
private fun printLiteralVariables(n: Number) {
    println("$n is of ${n::class.qualifiedName} type")
}