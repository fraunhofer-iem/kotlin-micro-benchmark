package de.fraunhofer.iem.uniqueToKotlin.inlineFunction.simpleExample

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
 * Demonstrate the usage of the inline function in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    log(fun(): Unit { println("Hello!!! Welcome to Kotlin") }) {
        it * 100
    }
}