package de.fraunhofer.iem.basics.kotlinOperators

/**
 * Demonstrates Logical operators in Kotlin
 *
 * In Java bytecode it uses logics
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val temp1: Boolean = getBool("bool")
    val temp2: Boolean = getBool("non bool")
    val temp3: Boolean = getBool("non bool")
    val temp4: Boolean = getBool("non bool")

    println(temp1 && temp2)
    println(temp3 || temp4)
    println(!temp2)

    dummy(temp1, temp2, temp3, temp4)
}

/**
 * Demonstrates Logical operator methods in Kotlin
 *
 * In Java bytecode, for operator methods it uses, & | operators, and for not it uses logics
 *
 * @author Ranjith Krishnamurthy
 */
fun dummy(temp1: Boolean, temp2: Boolean, temp3: Boolean, temp4: Boolean) {
    println(temp1.and(temp2))
    println(temp3.or(temp4))
    println(temp2.not())
}