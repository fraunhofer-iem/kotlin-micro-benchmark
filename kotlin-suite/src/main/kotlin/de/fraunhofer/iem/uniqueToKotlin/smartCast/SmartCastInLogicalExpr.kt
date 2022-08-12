package de.fraunhofer.iem.uniqueToKotlin.smartCast

/**
 * Demonstrates SmartCast in logical expression
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    parseString("")
    parseString(5)
    parseString("Ranjith")

    println(getLength(""))
    println(getLength(5))
    println(getLength("Ranjith"))
}

/**
 * SmartCast in logical or
 *
 * @author Ranjith Krishnamurthy
 */
fun parseString(ob: Any) {
    if (ob !is String || ob.length == 0)
        return println("Not a String or Empty String")

    println("Valid String")
}

/**
 * SmartCast in logical and
 *
 * @author Ranjith Krishnamurthy
 */
fun getLength(ob: Any): Int {
    if (ob is String && ob.length > 0)
        return ob.length

    return -1
}