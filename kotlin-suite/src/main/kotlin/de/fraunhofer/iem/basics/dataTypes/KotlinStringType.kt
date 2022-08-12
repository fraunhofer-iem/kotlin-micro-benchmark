package de.fraunhofer.iem.basics.dataTypes

/**
 * Demonstrates the String in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val rawStr: String = getRawStrings()
    val escapedString: String = getEscapedStrings()

    println(rawStr)
    println(escapedString)
}

/**
 * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
 */
fun getRawStrings(): String {
    val str1: String = """
        Hi, How are you?
        Welcome to kotlin
        
    """

    val str2: String = """
        Welcome to kotlin!!
        How are you doing
        
    """

    print("Enter some input: ")
    if (readLine() == "2")
        return str1

    return str2
}

/**
 * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
 */
fun getEscapedStrings(): String {
    val str1: String = "Hi, How are you?\nWelcome to kotlin\n"

    val str2: String = "Welcome to kotlin!!\nHow are you doing\n"

    print("Enter some input: ")
    if (readLine() == "2")
        return str1

    return str2
}