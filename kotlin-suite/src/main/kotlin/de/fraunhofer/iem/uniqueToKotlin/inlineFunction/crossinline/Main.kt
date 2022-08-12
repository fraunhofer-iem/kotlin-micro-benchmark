package de.fraunhofer.iem.uniqueToKotlin.inlineFunction.crossinline

/**
 * Higher order function with inline and crossinline in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */

inline fun log(crossinline func1: () -> Unit, func2: (Int) -> Int) {
    val ob = object {
        override fun toString(): String {
            func1()
            return "Object"
        }
    }

    println(ob)

    println(func2(10))
}

/**
 * Demonstrate the usage of the crossinline in inline function in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    log({
        println("Hello!!! Welcome to Kotlin")
        return@log
    }) {
        it * 100
    }

    log({
        println("Hello!!! Welcome to Kotlin")
        // return  // This is not possible because of crossinline
    }) {
        it * 100
    }
}