package de.fraunhofer.iem.uniqueToKotlin.inlineFunction.reifiedTypeParameter

/**
 * Demonstrate the reified type parameter with inline function
 *
 * @author Ranjith Krishnamurthy
 */
inline fun <reified T> checkIsReturnString(func: () -> Any?) {
    val res = func()

    if (res != null && res is T) {
        println("Function return as expected type")
    } else {
        println("Function does not return String but returns ${if(res != null) res::class.java else "null"}")
    }
}

/**
 * Demonstrate the reified type parameter with noinline function
 *
 * @author Ranjith Krishnamurthy
 */
inline fun <reified T> checkIsReturnStringEvenWithNoInline(noinline func: () -> Any?) {
    val res = func()

    if (res != null && res is T) {
        println("Function return String")
    } else {
        println("Function does not return String but returns ${if(res != null) res::class.java else "null"}")
    }
}

fun main() {
    checkIsReturnString<String> { "Ranjith" }
    checkIsReturnString<String> { null }
    checkIsReturnString<String> { 125 }
    checkIsReturnString<UInt> { 1U }

    checkIsReturnStringEvenWithNoInline<String> { "Ranjith" }
    checkIsReturnStringEvenWithNoInline<String> { null }
    checkIsReturnStringEvenWithNoInline<String> { 125 }
    checkIsReturnStringEvenWithNoInline<UInt> { 1U }
}