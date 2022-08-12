package de.fraunhofer.iem.uniqueToKotlin.stringTemplate

/**
 * Demonstrates String Template in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val rawStr: String = getRawStrings("Ranjith")
    val str: String = getEscapedStrings("Ranjith")

    println("Message = $rawStr\nLength= ${rawStr.length}")
    println("Message = " + str + "\nLength= " + str.length)
}

/**
 * Demonstrates the String template in Raw Strings
 *
 * @author Ranjith Krishnamurthy
 */
fun getRawStrings(name: String): String {
    return """
        >Hi, How are you $name?
        >Welcome to kotlin
        >${'$'}
        >
    """.trimMargin(">")
}

/**
 * Demonstrates the String template in Escaped Strings
 *
 * @author Ranjith Krishnamurthy
 */
fun getEscapedStrings(name: String): String {
    return "Hi, How are you $name?\nWelcome to kotlin\n"
}