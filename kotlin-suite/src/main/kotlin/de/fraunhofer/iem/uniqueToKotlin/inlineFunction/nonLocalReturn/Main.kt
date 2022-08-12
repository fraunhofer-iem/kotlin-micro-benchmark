package de.fraunhofer.iem.uniqueToKotlin.inlineFunction.nonLocalReturn

/**
 * Higher order function with inline in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
inline fun log(func1: () -> Unit, func2: (Int) -> Int) {
    println("Executing func1")
    func1()
    println("Completed Executing func1")

    println("Executing func2")
    val res = func2(123)
    println("Completed Executing func2 = $res")
}

/**
 * Demonstrate the usage of the non-local return in inline function in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    println("***** First function call *****")
    log({
        println("Hello!!! Welcome to Kotlin")
        return@log
    }) {
        var number = it
        var sum = 0
        while (number > 0) {
            val digit = number % 10
            sum += digit
            number /= 10

            if ((sum % 2) == 0)
                return@log sum
        }

        return@log sum
    }
    println("*****         End         *****")

    println("\n\n***** Second function call *****")
    log({
        println("Hello!!! Welcome to Kotlin")
        return  // Non-local return
    }) {
        it * 100
    }
    println("*****         End          *****")
}