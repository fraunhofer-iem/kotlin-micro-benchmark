package de.fraunhofer.iem.basics.exceptions

/**
 * Demonstrates the double catch block
 *
 * @author Ranjith Krishnamurthy
 */
private fun tryCatchExample1() {
    try {
        checkValid1("Ranjith")
        checkValid2("ranj345n")
    } catch (exception: NoSuchFieldException) {
        println("Something went wrong in tryCatchExample1 (NoSuchFieldException)")
    } catch (exception: NoSuchMethodException) {
        println("Something went wrong in tryCatchExample1 (NoSuchMethodException)")
    }
}

/**
 * Demonstrates the single catch block
 *
 * @author Ranjith Krishnamurthy
 */
private fun tryCatchExample2() {
    try {
        checkValid1("Ranjith")
        checkValid1("ranj345n")
    } catch (exception: NoSuchFieldException) {
        println("Something went wrong in tryCatchExample2 (NoSuchFieldException)")
    }
}

/**
 * Demonstrates the catch with finally block
 *
 * @author Ranjith Krishnamurthy
 */
private fun tryCatchExample3() {
    try {
        checkValid1("Ranjith")
        checkValid2("ranj345n")
    } catch (exception: NoSuchFieldException) {
        println("Something went wrong in tryCatchExample3 (NoSuchFieldException)")
    } catch (exception: NoSuchMethodException) {
        println("Something went wrong in tryCatchExample3 (NoSuchMethodException)")
    } finally {
        println("Finally executed in tryCatchExample3")
    }
}

/**
 * Demonstrates the just finally block
 *
 * @author Ranjith Krishnamurthy
 */
private fun tryCatchExample4() {
    try {
        checkValid1("Ranjith")
        checkValid2("ranj345n")
    } finally {
        println("Finally executed in tryCatchExample4")
    }
}

/**
 * Demonstrates the try expression
 *
 * Note: Value of the try catch expression is the last statement in the try block or the catch block.
 * For the value of the expression, finally block is not contributed.
 *
 * @author Ranjith Krishnamurthy
 */
private fun tryCatchExample5(): Int {
    return try {
        checkValid1("Ranjith")
        checkValid2("ranj345n")
        0
    } catch (exception: NoSuchFieldException) {
        println("Something went wrong in tryCatchExample3 (NoSuchFieldException)")
        -100
    } catch (exception: NoSuchMethodException) {
        println("Something went wrong in tryCatchExample3 (NoSuchMethodException)")
        -150
    } finally {
        println("Finally executed in tryCatchExample5")
    }
}

/**
 * Throws a NoSuchFieldException (Just for example)
 *
 * @author Ranjith Krishnamurthy
 */
@Throws(NoSuchFieldException::class)
private fun checkValid1(name: String) {
    if (name.matches(Regex(".*\\d.*"))) {
        throw NoSuchFieldException("Invalid name")
    }
}

/**
 * Throws a NoSuchMethodException (Just for example)
 *
 * @author Ranjith Krishnamurthy
 */
@Throws(NoSuchMethodException::class)
private fun checkValid2(name: String) {
    if (name.matches(Regex(".*\\d.*"))) {
        throw NoSuchMethodException("Invalid name")
    }
}

fun main() {
    tryCatchExample1()
    tryCatchExample2()
    tryCatchExample3()
    println("tryCatchExample5() return ${tryCatchExample5()}")
    tryCatchExample4()
}