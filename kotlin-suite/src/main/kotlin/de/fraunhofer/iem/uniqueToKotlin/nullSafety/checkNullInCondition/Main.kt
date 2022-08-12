package de.fraunhofer.iem.uniqueToKotlin.nullSafety.checkNullInCondition

/**
 * Demonstrates the null safety using the conditions in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    checkInIfCondition(null)
    checkInIfCondition("Ranjith")

    checkInWhileLoop(null)
    checkInWhileLoop("Ranjith")
}

fun checkInIfCondition(name: String?) {
    if (name != null) {
        println("$name = ${name.length}")
    } else {
        println("$name = 0")
    }
}

fun checkInWhileLoop(name: String?) {
    var tempName = name
    while (tempName != null) {
        println("$tempName = ${tempName.length}")
        tempName = null
    }
}