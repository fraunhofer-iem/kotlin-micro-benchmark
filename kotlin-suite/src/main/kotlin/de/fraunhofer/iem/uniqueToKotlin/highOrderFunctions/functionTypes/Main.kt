package de.fraunhofer.iem.uniqueToKotlin.highOrderFunctions.functionTypes

/**
 * Demonstrates the different function types in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    println(giveFun1()(10, "Fun1"))

    val fun2 = giveFun2()
    val res = fun2()
    println(res)

    val fun3: (Int, String) -> Unit = { a, b ->
        println("$a = $b")
    }

    runFun3(fun3)

    runFun4() { a, b ->
        "$this.($a = $b)"
    }

    runFun5(fun3)
    runFun5(null)
}

/**
 * Function that return another non-nullable function [(Int, String) -> String]
 *
 * @author Ranjith Krishnamurthy
 */
fun giveFun1(): (Int, String) -> String {
    return { a, b ->
        "$a = $b"
    }
}

/**
 * Function that return another non-nullable function [() -> String]
 *
 * @author Ranjith Krishnamurthy
 */
fun giveFun2(): () -> String {
    val fun2: () -> String = {
        "Fun2"
    }

    return fun2
}

/**
 * Function that takes another non-nullable function [(Int, String) -> Unit]
 *
 * @author Ranjith Krishnamurthy
 */
fun runFun3(fun3: (Int, String) -> Unit) {
    fun3(10, "Fun3")
    fun3.invoke(10, "Fun3")
}

/**
 * Function that takes another non-nullable function with receiver [Int.(A: Int, B: String)]
 *
 * @author Ranjith Krishnamurthy
 */
fun runFun4(fun4: Int.(A: Int, B: String) -> String) {
    println(1.fun4(10, "Fun3"))
    println(fun4.invoke(2, 10, "Fun3"))
}

/**
 * Function that takes another nullable function [((Int, String) -> Unit)?]
 *
 * @author Ranjith Krishnamurthy
 */
fun runFun5(fun3: ((Int, String) -> Unit)?) {
    fun3?.invoke(10, "Fun3")
}