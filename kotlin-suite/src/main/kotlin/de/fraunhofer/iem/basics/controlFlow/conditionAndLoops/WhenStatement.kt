package de.fraunhofer.iem.basics.controlFlow.conditionAndLoops

/**
 * Demonstrates the when statement and when expression in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main(args: Array<String>) {
    simpleWhenStatement(90)
    println(simpleWhenExpression(20))
    println(whenWithCommonBehaviour(5))
    println(whenWithArbitraryExprAndAsIfElseIfExpr("200"))
    println(whenWithInAndIsOperator(999))
    println(whenWithCaptureVariable("99998"))
    anotherExampleForPresentation(args)
}

/**
 * Simple when statement
 *
 * @author Ranjith Krishnamurthy
 */
fun simpleWhenStatement(num: Int) {
    when (num) {
        0 -> println("Zero")
        1 -> println("One")
        5 -> println("Five")
        10 -> println("Ten")
        20 -> println("Twenty")
        90 -> println("Ninety")
        else -> println("Others")
    }
}

/**
 * Simple when expression
 *
 * @author Ranjith Krishnamurthy
 */
fun simpleWhenExpression(num: Int): String {
    val str: String = when (num) {
        0 -> "Zero"
        1 -> "One"
        5 -> "Five"
        10 -> "Ten"
        20 -> "Twenty"
        90 -> "Ninety"
        else -> "Others"
    }

    return "Given number is $str"
}

/**
 * Demonstrates the when expression for common behavior for multiple match
 *
 * @author Ranjith Krishnamurthy
 */
fun whenWithCommonBehaviour(num: Int): String {
    val str: String = when (num) {
        0, 1, 5 -> "Zero or One or Five"
        10, 20, 90 -> "Ten or Twenty or Ninety"
        else -> "Others"
    }

    return "Given number is $str"
}

/**
 * Demonstrates the when expression that contains a expression in the match and also demonstrates the when expression as
 * alternative to if else if expression
 *
 * @author Ranjith Krishnamurthy
 */
fun whenWithArbitraryExprAndAsIfElseIfExpr(str: String): String {
    val res: String = when {
        str.isNotEmpty() -> "String is non empty"
        str.toIntOrNull() == null -> "Can not parse the string to Int"
        str.toIntOrNull() != null -> "Can parse the string to Int"
        str.startsWith("Kotlin") -> "Given string starts with Kotlin"
        else -> "Unknown"
    }

    return "Given string first matches \"$res\""
}

/**
 * Demonstrates the when expression that contains in and is operator
 *
 * @author Ranjith Krishnamurthy
 */
fun whenWithInAndIsOperator(ob: Any): String {
    val res: String = when (ob) {
        !is Number -> "Not an Number"
        in 0..5 -> "Given number is in range of 0 to 5"
        is Int -> "Given number is Int"
        in 100..1000 -> "Given number is in range of 100 to 1000"
        else -> "Unknown"
    }

    return "Given string first matches \"$res\""
}

/**
 * Demonstrates when expression that captures the value in a variable. The variable scope is inside the when body.
 *
 * @author Ranjith Krishnamurthy
 */
fun whenWithCaptureVariable(str: String): String {
    return if (str.toIntOrNull() != null) {
        when (val len: Int = str.length) {
            1 -> "One digit number! Length = $len"
            2 -> "Two digits number! Length = $len"
            3 -> "Three digits number! Length = $len"
            4 -> "Four digits number! Length = $len"
            5 -> "Five digits number! Length = $len"
            else -> "Greater than 5 digits number! Length = $len"
        }
    } else {
        "Given string does not contain a valid number"
    }
}

/**
 * Demonstrates simple when statement in Kotlin for presentation purpose
 *
 * @author Ranjith Krishnamurthy
 */
fun anotherExampleForPresentation(args: Array<String>) {
    when (args[0]) {
        "hi" -> println("Hi!")
        "hello" -> println("Hello!")
        "how are you" -> println("How Are You?")
        else -> println("What should i tell?")
    }
}