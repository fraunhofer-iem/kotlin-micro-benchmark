package de.fraunhofer.iem.uniqueToKotlin.highOrderFunctions.rightAssociativeInFunctionTypes

/**
 * Function that takes another function of type (Int) -> (Int) -> Int which is equivalent to
 * (Int) -> ((Int) -> Int)
 *
 * @author Ranjith Krishnamurthy
 */
fun callFun(fun1: (Int) -> (Int) -> Int) {
    val res: Int = fun1(10)(10)
    println(res)
}

/**
 * Demonstrates the right associative in function type.
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    // (Int) -> ((Int) -> Int) which is also equivalent to fun2
    val fun1: (Int) -> ((Int) -> Int) = { a ->
        { b ->
            b + a
        }
    }

    // (Int) -> (Int) -> Int which is also equivalent to fun1
    val fun2: (Int) -> (Int) -> Int = { a ->
        { b ->
            b * a
        }
    }

    callFun(fun1)
    callFun(fun2)
}