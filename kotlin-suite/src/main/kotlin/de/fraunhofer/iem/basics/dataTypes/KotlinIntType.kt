package de.fraunhofer.iem.basics.dataTypes

/**
 * Demonstrates in which scenario Kotlin uses Java's primitive type and Class type.
 *
 * Main method demonstrates, in which scenario local variables inside the function body takes Java's primitive types
 * and Class type.
 * dummy1 method demonstrates, what is the data types for non-nullable int in bytecode for parameters
 * dummy2 method demonstrates, what is the data types for nullable int in bytecode for parameters
 * dummy3 method demonstrates, what is the data types for collection of int in bytecode for parameters
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    // For below 3 lines, Kotlin uses java primitive int
    val num1: Int = getInt(234)
    val num2: Int = getInt(2)
    val sum: Int = num1 + num2
    println(sum)

    // For below 3 lines, Kotlin uses Java class Integer,
    // For a it uses Integer, because there is === operator between a and boxedA
    // For boxedA it uses Integer, because boxedA is nullable type.
    // https://kotlinlang.org/docs/basic-types.html#numbers-representation-on-the-jvm
    var a: Int = 100
    a += 25648
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b: Int = 10000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA === anotherBoxedA)
    println(boxedB === anotherBoxedB)
    println(boxedB === b)

    println(boxedA == anotherBoxedA)
    println(boxedB == anotherBoxedB)
    println(boxedB == b)

    // For below Kotlin uses Integer because, in Java we can not have list of primitive types.
    val lst: ArrayList<Int> = arrayListOf(1, 2, 3, 4)
    println(lst.add(10))
}

fun dummy1(a: Int, b: Int) {
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA === anotherBoxedA)
    println(boxedB === anotherBoxedB)
    println(boxedA === a)
    println(boxedB === b)

    println(boxedA == anotherBoxedA)
    println(boxedB == anotherBoxedB)
    println(boxedA == a)
    println(boxedB == b)
}

fun dummy2(a: Int?, b: Int?) {
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA === anotherBoxedA)
    println(boxedB === anotherBoxedB)
    println(boxedA === a)
    println(boxedB === b)

    println(boxedA == anotherBoxedA)
    println(boxedB == anotherBoxedB)
    println(boxedA == a)
    println(boxedB == b)

}

fun dummy3(a: ArrayList<Int>, b: List<Int?>) {
    val num: Int = 21520
    println(a.add(num))
    println(b)
}

/**
 * Dummy method to avoid optimization. If we do not use this then compiler will not create variable, instead uses literals.
 */
fun getInt(range: Int): Int {
    if (range < 100)
        return 50

    return 250
}