package de.fraunhofer.iem.basics.kotlinOperators

/**
 * Demonstrates the Comparison operators in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val num1: Int = getInt("int")
    val num2: Int = getInt("int")

    println(num1 > num2)
    println(num1 < num2)
    println(num1 >= num2)
    println(num1 <= num2)
    println(num1 == num2)
    println(num1 != num2)

    val num3: Double = getDouble("double")
    val num4: Double = getDouble("double")

    println(num3 > num4)
    println(num3 < num4)
    println(num3 >= num4)
    println(num3 <= num4)
    println(num3 == num4)
    println(num3 != num4)

    dummy(102, 2020)
}

/**
 * Demonstrates the comparison operator on Any
 *
 * @param num1 Object1
 * @param num2 Object2
 */
private fun dummy(num1: Any, num2: Any) {
    println(num1 == num2)
    println(num1 != num2)

    // For below its not supported for Any type
    // println(num1 > num2)
    // println(num1 < num2)
    // println(num1 >= num2)
    // println(num1 <= num2)
}

/**
 * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
 */
fun getInt(str: String): Int {
    if (str == "int") {
        return 50;
    }

    return 150;
}

/**
 * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
 */
fun getDouble(str: String): Double {
    if (str == "double") {
        return 50.20
    }

    return 150.50
}