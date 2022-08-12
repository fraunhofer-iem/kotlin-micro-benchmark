package de.fraunhofer.iem.basics.variables

/**
 * Main method.
 *
 * Demonstrates the variables in Kotlin.
 * <p>
 * Note: In byte code variable declared with var and val variable both are same. Keyword val is just a keyword for a compiler to know
 * that it is not allowed to update.
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    var variable: Int = getVariableValue()
    val constant: Float = getPiValue()

    variable += 10;

    println(variable)
    println(constant)
}

/**
 * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
 */
fun getVariableValue(): Int {
    print("Enter some input: ")
    if (readLine() == "y")
        return 10

    return 20
}

/**
 * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
 */
fun getPiValue(): Float {
    print("Enter some input: ")
    if (readLine() == "2")
        return 3.14F

    return 3.141592F
}