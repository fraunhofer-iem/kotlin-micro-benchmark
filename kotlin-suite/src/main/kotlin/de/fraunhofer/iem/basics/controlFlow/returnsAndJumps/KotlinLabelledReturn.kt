package de.fraunhofer.iem.basics.controlFlow.returnsAndJumps

/**
 * Demonstrates the return statement in Lambda expression
 *
 * Note: Here the return is non local return i.e. it returns from the returnInLambda function. These non local return is
 * possible only in lambda expression with inline function.
 *
 * Therefore the print "Welcome to Lambda" will never be printed.
 *
 * see: https://kotlinlang.org/docs/returns.html#return-at-labels
 *
 * @author Ranjith Krishnamurthy
 */
private fun returnInLambda() {
    val numbers = ArrayList<Int>()
    numbers.add(5)
    numbers.add(9)
    numbers.add(8)
    numbers.add(1)
    numbers.forEach { n: Int ->
        println(n)
        if (n % 2 == 0) return   // return to the caller of returnInLambda function
        println("Welcome to Lambda")
    }

    println("End of function")
}

/**
 * Demonstrates the return with label to perform local return.
 *
 * In this case it calls the forEach for every case even though there is a return statement.
 *
 * It also prints the "Welcome to Lambda" because of local return.
 *
 * @author Ranjith Krishnamurthy
 */
private fun returnInLambdaWithLabel() {
    val numbers = ArrayList<Int>()
    numbers.add(5)
    numbers.add(9)
    numbers.add(8)
    numbers.add(1)
    numbers.forEach local@{ n: Int ->
        println(n)
        if (n % 2 == 0) return@local   // return to the caller of returnInLambda function
        println("Welcome to Lambda")
    }

    println("End of function")
}

/**
 * Same as returnInLambdaWithLabel but instead of explicit label, it uses implicit label. i.e. the name of the function
 * that calls the lambda expression
 *
 * @author Ranjith Krishnamurthy
 */
private fun returnInLambdaWithImplicitLabel() {
    val numbers = ArrayList<Int>()
    numbers.add(5)
    numbers.add(9)
    numbers.add(8)
    numbers.add(1)
    numbers.forEach { n: Int ->
        println(n)
        if (n % 2 == 0) return@forEach   // return to the caller of returnInLambda function
        println("Welcome to Lambda")
    }

    println("End of function")
}

/**
 * Demonstrates the return with anonymous function
 *
 * Prints the "Welcome to Lambda", because return statement returns from the anonymous function.
 *
 * @author Ranjith Krishnamurthy
 */
private fun returnInLambdaWithAnonymousFunction() {
    val numbers = ArrayList<Int>()
    numbers.add(5)
    numbers.add(9)
    numbers.add(8)
    numbers.add(1)
    numbers.forEach(fun(n: Int) {
        println(n)
        if (n % 2 == 0) return  // Returns from the anonymous function (local return)
        println("Welcome to Lambda")
    })

    println("End of function")
}

/**
 * The above function behaves as a continue statement. But the returnInLambda returns from the outer function completely,
 * therefore to stop the lambda expression complete but still stay inside the caller function i.e. behave as a break statement
 * use outer loop
 *
 * @author Ranjith Krishnamurthy
 */
private fun returnInLambdaWithBreakBehaviour() {
    val numbers = ArrayList<Int>()
    numbers.add(5)
    numbers.add(9)
    numbers.add(8)
    numbers.add(1)
    run loop@ {
        numbers.forEach(fun(n: Int) {
            println(n)
            if (n == 5) return@loop

            println("Welcome to Lambda")
        })

        println("End of run loop@")
    }

    println("End of function")
}

/**
 * Demonstrates the multiple return to different places
 *
 * @author Ranjith Krishnamurthy
 */
private fun returnInLambdaWithMultipleReturn() {
    val numbers = ArrayList<Int>()
    numbers.add(5)
    numbers.add(9)
    numbers.add(8)
    numbers.add(1)
    run loop@ {
        numbers.forEach(fun(n: Int) {
            println(n)
            if (n == 5) return@loop

            if (n == 1) return@forEach

            if (n == 2) return@returnInLambdaWithMultipleReturn

            println("Welcome to Lambda")
        })

        println("End of run loop@")
    }

    println("End of function")
}

/**
 * Demonstrates the returning a value to a particular label
 *
 * @author Ranjith Krishnamurthy
 */
private fun returnWithValueInLambda() {
    val numbers = ArrayList<Int>()
    numbers.add(5)
    numbers.add(9)
    numbers.add(8)
    numbers.add(1)
    val res: Int = run loop@ {
        numbers.forEach(fun(n: Int) {
            println(n)
            if (n == 5) return@loop -1  // Returns -1 to res

            if (n == 1) return@forEach

            if (n == 2) return@returnWithValueInLambda

            println("Welcome to Lambda")
        })

        println("End of run loop@")
        -12     // Returns -12 to res
    }

    println("End of function res = $res")
}

fun main() {
    returnInLambda()
    returnInLambdaWithLabel()
    returnInLambdaWithImplicitLabel()
    returnInLambdaWithBreakBehaviour()
    returnInLambdaWithAnonymousFunction()
    returnInLambdaWithMultipleReturn()
    returnWithValueInLambda()
}