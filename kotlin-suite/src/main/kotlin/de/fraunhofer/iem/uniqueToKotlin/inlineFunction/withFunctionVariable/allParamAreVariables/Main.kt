package de.fraunhofer.iem.uniqueToKotlin.inlineFunction.withFunctionVariable.allParamAreVariables

/**
 * Higher order function which is inline in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
inline fun log(func1: () -> Unit, func2: (Int) -> Int) {
    println("Executing func1")
    func1()
    println("Completed Executing func1")

    println("Executing func2")
    val res = func2(10)
    println("Completed Executing func2 = $res")
}

/**
 * Demonstrate the usage of the inline function in Kotlin, in which all the  functions are explicitly stored in a variable
 * that prevents from that function being inlined
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val func1: () -> Unit = {
        println("Hello!!! Welcome to Kotlin")
    }

    val func2: (Int) -> Int = {
        it * 100
    }

    log(func1, func2)
}