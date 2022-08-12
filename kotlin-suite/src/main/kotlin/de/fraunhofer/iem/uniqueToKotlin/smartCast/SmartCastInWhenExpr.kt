package de.fraunhofer.iem.uniqueToKotlin.smartCast

fun main() {
    checkType(10)
    checkType(451.54F)
    checkType("Ranjith")
    checkType(451.54)
}

/**
 * demonstrates SmartCast in when statement
 *
 * @author Ranjith Krishnamurthy
 */
fun checkType(ob: Any) {
    when (ob) {
        is Int -> println("Int, value = $ob")
        is String -> println("String, value = $ob, length = ${ob.length}")
        is Float -> println("Float, value = $ob")
        "gdf" -> println()
        1 -> println("Numbers")
        else -> println("Other")
    }
}