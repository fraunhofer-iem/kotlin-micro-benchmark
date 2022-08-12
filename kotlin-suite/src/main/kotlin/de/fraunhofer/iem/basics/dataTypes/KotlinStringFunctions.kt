package de.fraunhofer.iem.basics.dataTypes

/**
 * Demonstrates the Kotlin string inbuilt functions
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val greet: String = "Hi Welcome!!!"

    // For below, it uses Java string built in functions
    println(greet.length)
    println(greet[0])
    println(greet.subSequence(2, 4))
    println(greet.compareTo("How are you"))
    println(greet.codePointAt(0))

    // In Java bytecode, it uses <java.lang.String: java.lang.String toUpperCase(java.util.Locale)>
    println(greet.uppercase())

    // In Java bytecode, it uses <kotlin.text.StringsKt: java.lang.CharSequence trim(java.lang.CharSequence)>
    println(greet.trim())
}